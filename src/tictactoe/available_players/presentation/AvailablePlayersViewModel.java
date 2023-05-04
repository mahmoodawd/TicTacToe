/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.presentation;

import java.util.List;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author 3WD
 */
public class AvailablePlayersViewModel {
    private SimpleBooleanProperty accepted;
    private List<SimpleStringProperty> availablePlayers;
    private SimpleStringProperty selectedPlayer;
    private SimpleStringProperty requester;

    public SimpleBooleanProperty getAccepted() {
        return accepted;
    }

    public void setAccepted(SimpleBooleanProperty accepted) {
        this.accepted = accepted;
    }

    public List<SimpleStringProperty> getAvailablePlayers() {
        return availablePlayers;
    }

    public void setAvailablePlayers(List<SimpleStringProperty> availablePlayers) {
        this.availablePlayers = availablePlayers;
    }

    public SimpleStringProperty getSelectedPlayer() {
        return selectedPlayer;
    }

    public void setSelectedPlayer(SimpleStringProperty selectedPlayer) {
        this.selectedPlayer = selectedPlayer;
    }

    public SimpleStringProperty getRequester() {
        return requester;
    }

    public void setRequester(SimpleStringProperty requester) {
        this.requester = requester;
    }
    
    public void selectPlayer(){
        
    }
    public void sendRequest(){
        
    }
    public void receivedRequest(){
        
    }
    public void accept(){
        accepted.set(true);
        
    }
    public void deny(){
        accepted.set(false);
    }
    
}
