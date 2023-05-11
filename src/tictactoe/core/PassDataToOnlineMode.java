/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ASUS
 */
public class PassDataToOnlineMode {
    
    
        private static PassDataToOnlineMode instance  = null;
    public static SimpleStringProperty playerOneName = new SimpleStringProperty();
    public static SimpleStringProperty playerTwoName = new SimpleStringProperty();
    private PassDataToOnlineMode()
    {
    
    }

    public  SimpleStringProperty getPlayerOneName() {
        return playerOneName;
    }

    public  void setPlayerOneName(SimpleStringProperty playerOneName) {
        PassDataToOnlineMode.playerOneName = playerOneName;
    }

    public  SimpleStringProperty getPlayerTwoName() {
        return playerTwoName;
    }

    public  void setPlayerTwoName(SimpleStringProperty playerTwoName) {
        PassDataToOnlineMode.playerTwoName = playerTwoName;
    }
    
    
   
   public static synchronized PassDataToOnlineMode getInstance()
    {
  
     if(instance == null){
        instance = new PassDataToOnlineMode();
        }
     
    
    
    return instance;
    }
}
