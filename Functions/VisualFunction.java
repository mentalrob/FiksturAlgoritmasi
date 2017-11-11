/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import DataTypes.Team;

/**
 *
 * @author halil
 */
public class VisualFunction {
    private static String EOF = "+---------------------------------------------------+%n";
    private static String HeadFormat = "|%-51s|%n" + EOF;
    private static String MatchupFormat = "|%-25s|%-25s|%n" + EOF;
    public static void writeHead(int Head){
        System.out.printf(((Head == 1) ? EOF : "") + HeadFormat, StringUtils.center("Week " + Head, 51));
    }
    
    public static void writeMatchUp(Team Team1,Team Team2){
        if(Team1 == null || Team2 == null) return;
        System.out.printf(MatchupFormat,StringUtils.center(Team1.getTakimName().toString(), 25),StringUtils.center(Team2.getTakimName().toString(), 25));
    }
}
