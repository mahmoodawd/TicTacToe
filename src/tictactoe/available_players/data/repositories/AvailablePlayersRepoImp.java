/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.data.repositories;

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
    public List<Player> getAvailablePlayers() {        
        fetchPlayersListFromServer();
        List<Player> players = new ArrayList();
        players.addAll(availablePlayers);
        return players;
    }

    private void fetchPlayersListFromServer() {
        //pretend to get players list from server

        for (int i = 0; i < 100; i++) {
            availablePlayers.add(new Player("Player " + i));
        }
    }
    @Override
    public boolean sendRequest(Player requester, Player receiver){
        //Send playing request to the receiver
        System.out.println(receiver.getName());
        return false ;
    }
    @Override
    public boolean listenForRequest(){
        boolean result = true; //should be retrieved from the server
        return result;
    }
    }


