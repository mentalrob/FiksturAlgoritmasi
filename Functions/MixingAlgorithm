/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import DataTypes.Teams;
import java.util.Random;

/**
 *
 * @author dell
 */
public class MixingAlgorithm {
    private static Teams[] randomTeams(Teams[] oTeams){
        Random rand = new Random();
        Teams[] array = oTeams;
        for(int i = 0; i < oTeams.length; i++){
            int eleman1 = rand.nextInt(oTeams.length);
            int eleman2 = rand.nextInt(oTeams.length);
            
            Teams memory = array[eleman1];
            array[eleman1] = array[eleman2];
            array[eleman2] = memory;
        }
        
     
        return array;
    }
    public static Teams[] randomCreate(String[] args){
        int randomCount;
        try{
            randomCount = Integer.parseInt(args[0]);
        }catch(Exception ex){
            return randomTeams(Teams.values());
        }
        randomCount = (randomCount > 18) ? 18 : randomCount;
        randomCount = (randomCount % 2 == 1) ? randomCount + 1 : randomCount; 
        Teams[] array = new Teams[randomCount];
        
        for(int x = 0; x < randomCount; x ++){
            array[x] = randomTeams(Teams.values())[x];
        }
        
        
        return array;
    }
}
