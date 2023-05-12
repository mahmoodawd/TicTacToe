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
public class PassPlayerNameMultiMode {
    
    

    
    private static PassPlayerNameMultiMode instance  = null;
     public static SimpleStringProperty playerOneName = new SimpleStringProperty();
        public static SimpleStringProperty playerTwoName = new SimpleStringProperty();
    private PassPlayerNameMultiMode()
    {
    
    }
    
   
   public static synchronized PassPlayerNameMultiMode getInstance()
    {
  
     if(instance == null){
        instance = new PassPlayerNameMultiMode();
        }
     
    return instance;
    
   
    }
   
   
    public void setPlayerOneName(String name)
    {
        
      playerOneName.set(name); 
     
    }
   
    public String getPlayerOneName()
    {
      return playerOneName.get();
    }
   
     public void setPlayerTwoName(String name)
    {
        
      playerTwoName.set(name); 
      
    }
   
    public String getPlayerTwoName()
    {
      return playerTwoName.get();
    }
    
    
    
}

    
    
    

