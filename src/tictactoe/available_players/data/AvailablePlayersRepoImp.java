/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.data;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tictactoe.available_players.domain.repositories.AvailablePlayersRepoInterface;
import tictactoe.available_players.domain.model.Player;

/**
 *
 * @author ASUS
 */
public class AvailablePlayersRepoImp implements AvailablePlayersRepoInterface {

    List<Player> availablePlayers;

    public AvailablePlayersRepoImp() {
        availablePlayers = new ArrayList<>();
    }

    @Override
    public ObservableList<Player> getAvailablePlayers() {
        fetchPlayersList();
        ObservableList<Player> players = FXCollections.observableArrayList();
        players.setAll(availablePlayers);
        return players;
    }

    public void fetchPlayersList() {
        //pretend to get players list from server

        for (int i = 0; i < 100; i++) {
            availablePlayers.add(new Player("Player " + i));
        }
    }
    
    public boolean sendRequest(Player requester, Player receiver){
        //Send playing request to the receiver
        System.out.println(receiver.getName());
        return false ;
    }
    }


