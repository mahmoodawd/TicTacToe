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
public class PassPlayerNameSingleMode {
    
    

    
    private static PassPlayerNameSingleMode instance  = null;
     public static SimpleStringProperty playerName = new SimpleStringProperty();
    private PassPlayerNameSingleMode()
    {
    
    }
    
   
   public static synchronized PassPlayerNameSingleMode getInstance()
    {
  
     if(instance == null){
        instance = new PassPlayerNameSingleMode();
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

    
    
    

