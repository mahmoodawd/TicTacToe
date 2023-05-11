/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.main_menu.presentation.single_mode;

import tictactoe.core.PassPlayerNameSingleMode;

/**
 *
 * @author Aya
 */
public class SingleModeViewModel {
    
    
   
    private String playerNameTxt;
    private boolean isPlayerTurn;
    
    public void recordPlayerName() {
        String name = playerNameTxt;
        // do something with the player name, e.g. store it in a database
    }
    
    // getters and setters for the member variables
    public String getPlayerNameTxt() {
        return playerNameTxt;
    }

    public void setPlayerNameTxt(String playerNameTxt) {
        this.playerNameTxt = playerNameTxt;
        
           PassPlayerNameSingleMode.getInstance().setPlayerName(playerNameTxt);
    }

    public boolean getIsPlayerTurn() {
        return isPlayerTurn;
    }

    public void setIsPlayerTurn(boolean isPlayerTurn) {
        this.isPlayerTurn = isPlayerTurn;
    }
   
   
    
    }





    
    

