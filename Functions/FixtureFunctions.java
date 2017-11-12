/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import DataTypes.Team;
import DataTypes.Teams;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author halil
 */
public class FixtureFunctions {

    public static Team[][] nextWeekPositionCreate(Team[][] Teams, Teams LastTeam) {
        Team[][] nTeams = new Team[Teams.length][Teams[0].length];
        //Algoritmanın 1.adımını uyguladık.
        nTeams[0][(Teams[0][0].getTakimName() == LastTeam) ? 1 : 0] = new Team(LastTeam);
        nTeams[0][(Teams[0][0].getTakimName() == LastTeam) ? 0 : 1] = new Team(Teams[Teams.length - 1][1].getTakimName());
        //Takımları Kaydırıyoruz
        Team[][] tempTeams = diff(Teams, LastTeam);
        //Algoritmanın ikinci adımını uyguluyoruz...
        tempTeams = reverse(tempTeams);
        //Sonuçları Birleştiriyoruz
        for (int x = 0; x < tempTeams.length; x++) {
            nTeams[x + 1] = tempTeams[x];
        }
        //finish
        return nTeams;
    }

    private static Team[][] reverse(Team[][] oTeams) {
        List<Team[]> tList = Arrays.asList(oTeams);
        Collections.reverse(tList);
        Team[][] nTeams = (Team[][]) tList.toArray();
        return nTeams;
    }

    private static Team[][] diff(Team[][] Teams, Teams LastTeam) {
        Team[][] tempTeams = new Team[Teams.length - 1][Teams[0].length]; // kaydırma işlemi için açtık bir eksik olmasının sebebi 1.maçı yukarda zaten belirledik
        //Kaydırma işlemini Yapıyoruz
        for (int x = 0; x < Teams.length; x++) {
            for (int y = 0; y < Teams[x].length; y++) {
                try {
                    if (Teams[(y == 1) ? x + 1 : x][(y == 1) ? 0 : 1].getTakimName() == LastTeam) {
                        tempTeams[x][y] = Teams[x][y];
                        continue; // Fixtur Jokeri Kontrolü 
                    }
                    if (((y == 1) ? x + 1 : x) == Teams.length - 1 && ((y == 1) ? 0 : 1) == 1) {
                        continue; // Hafta Sonu Kontrolü // bence bu kod gereksiz try catche düşecek çalışmayacak bile
                    }
                    tempTeams[x][y] = new Team(Teams[(y == 1) ? x + 1 : x][(y == 1) ? 0 : 1].getTakimName());  // Kaydırma imleci
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
        return tempTeams;
    }
}
