/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

import Functions.FixtureFunctions;
import Functions.VisualFunction;
import javax.swing.text.Position;

/**
 *
 * @author halil
 */
public class Week {

    private Team[][] Positions;
    private static int TeamCount;
    private int WeekNumber;
    private static Teams LastTeam;

    public Week() {
        this.Positions = new Team[(int) TeamCount / 2][2];
    }

    public static Week Create(Teams... Teams) {
        Week.TeamCount = Teams.length;
        Week nWeek = new Week();
        nWeek.setWeekNumber(1);
        for (int x = 0; x < Teams.length; x++) {
            nWeek.setTeam((int)x/2, (x % 2 == 0) ? 0 : 1, new Team(Teams[x]));
        }
        Week.LastTeam = nWeek.getTeam(0, 1).getTakimName();
        return nWeek;
    }

    public Week nextWeek() {
        Week nWeek = new Week();
        nWeek.setWeekNumber(this.WeekNumber + 1);
        //Algoritmayı uygulayalım
        Team[][] nPositions = FixtureFunctions.nextWeekPositionCreate(Positions, LastTeam);
        //Yeni Haftaya Yeni Pozisyonları aktaralım
        for(int x=0;x<nPositions.length;x++){
            for(int y=0;y<nPositions[x].length;y++){
                nWeek.setTeam(x, y, nPositions[x][y]);
            }
        }
        return nWeek; // bitti
    }

    public void setTeam(int index1, int index2, Team team) {
        Positions[index1][index2] = team;
    }

    public Team getTeam(int index1, int index2) {
        return Positions[index1][index2];
    }

    public int getWeekNumber() {
        return WeekNumber;
    }

    public void setWeekNumber(int WeekNumber) {
        this.WeekNumber = WeekNumber;
    }
    
    public void toVisualize(){
        VisualFunction.writeHead(this.WeekNumber);
        for(int x=0;x<Positions.length;x++){
            VisualFunction.writeMatchUp(Positions[x][0], Positions[x][1]);
        }
    }
}
