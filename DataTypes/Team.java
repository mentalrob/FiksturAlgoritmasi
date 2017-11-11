/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/**
 *
 * @author halil
 */
public class Team {
    private Teams TakimName;
    private int Score;

    public Team(Teams TakimName) {
        this.TakimName = TakimName;
    }

    public Teams getTakimName() {
        return TakimName;
    }
    
}
