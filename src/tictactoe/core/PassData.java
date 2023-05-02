/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import javafx.beans.property.SimpleBooleanProperty;

public class PassData {
    
    private static PassData instance  = null;
    public static SimpleBooleanProperty menuDialogReturn = new SimpleBooleanProperty();
    
    private PassData()
    {
    
    }
    
   
   public static synchronized PassData getInstance()
    {
  
     if(instance == null){
        instance = new PassData();
        }
     menuDialogReturn.setValue(null);
    
    
    return instance;
    }
    
    
    
    
}
