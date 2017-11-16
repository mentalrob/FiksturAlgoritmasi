/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixturealgorithm;

import DataTypes.Team;
import DataTypes.Teams;
import DataTypes.Week;
import Functions.StringUtils;
import Functions.VisualFunction;
import Functions.MixingAlgorithm;
/**
 *
 * @author halil
 */
public class start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Teams[] Ex;
       // Ex = Teams.values();
        Ex = MixingAlgorithm.randomCreate(args);
        Week Temp = null;
        for (int x = 1; x < Ex.length; x++) {
            Temp = (x==1) ? Week.Create(Ex) : Temp.nextWeek();
            Temp.toVisualize();
        }

    }

}
