/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.main_menu.presentation.multi_mode;

/**
 *
 * @author Aya
 */
public class MultiModeViewModel {
  
 
    private String firstPlayerNameTxt;
    private String secondPlayerName;
    
    public void recordPlayerNames() {
        String name1 = firstPlayerNameTxt;
        String name2 = secondPlayerName;
        // do something with the player names, e.g. store them in a database
    }
    
    // getters and setters for the member variables
    public String getFirstPlayerNameTxt() {
        return firstPlayerNameTxt;
    }

    public void setFirstPlayerNameTxt(String firstPlayerNameTxt) {
        this.firstPlayerNameTxt = firstPlayerNameTxt;
    }

    public String getSecondPlayerName() {
        return secondPlayerName;
    }

    public void setSecondPlayerName(String secondPlayerName) {
        this.secondPlayerName = secondPlayerName;
    }
}
  
    
    

