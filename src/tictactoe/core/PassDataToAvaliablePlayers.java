/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import javafx.beans.property.SimpleStringProperty;
public class PassDataToAvaliablePlayers {
    
    
        private static PassDataToAvaliablePlayers instance  = null;
    public  SimpleStringProperty playerOneName = new SimpleStringProperty();
    private PassDataToAvaliablePlayers()
    {
    
    }

    public  SimpleStringProperty getPlayerOneName() {
        return playerOneName;
    }

    public  void setPlayerOneName(String playerName) {
        playerOneName.set(playerName);
    }
    
       
   public static synchronized PassDataToAvaliablePlayers getInstance()
    {
  
     if(instance == null){
        instance = new PassDataToAvaliablePlayers();
        }
     
    
    
    return instance;
    }
}
