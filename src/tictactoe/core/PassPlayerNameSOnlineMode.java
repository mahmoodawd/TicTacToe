/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Aya
 */
public class PassPlayerNameSOnlineMode {
    
    

    
    private static PassPlayerNameSOnlineMode instance  = null;
     public static SimpleStringProperty playerName = new SimpleStringProperty();
    private PassPlayerNameSOnlineMode()
    {
    
    }
    
   
   public static synchronized PassPlayerNameSOnlineMode getInstance()
    {
  
     if(instance == null){
        instance = new PassPlayerNameSOnlineMode();
        }
     
    return instance;
    
   
    }
   
   
    public void setPlayerName(String name)
    {
        System.out.println(name);
      playerName.set(name); 
        System.out.println(playerName.get());
    }
   
    public String getPlayerName()
    {
      return playerName.get();
    }
   
    
    
    
    
}

    
    
    

