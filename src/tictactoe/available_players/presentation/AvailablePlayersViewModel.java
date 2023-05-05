/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.presentation;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import tictactoe.available_players.data.AvailablePlayersRepoImp;
import tictactoe.available_players.domain.model.Player;

/**
 *
 * @author 3WD
 */
public class AvailablePlayersViewModel {

    AvailablePlayersRepoImp availablePlayersRepo;
    ObservableList<Player> availablePlayers;
    private SimpleBooleanProperty accepted;
    private SimpleObjectProperty<RequestStatus> requestStatus = new SimpleObjectProperty<>();
    private Player requester;

    public AvailablePlayersViewModel() {
        availablePlayersRepo = new AvailablePlayersRepoImp();

//        requestStatus.set(RequestStatus.SENDING);
        availablePlayers = availablePlayersRepo.getAvailablePlayers();
    }

    public ObservableList<Player> getAvailablePlayers() {
        return availablePlayers;
    }

    public SimpleObjectProperty<RequestStatus> getRequestStatus() {
        return requestStatus;
    }

    public void sendRequest(Player receiver) {

        requestStatus.set(availablePlayersRepo.sendRequest(requester, receiver)
                ? RequestStatus.ACCEPTED : RequestStatus.REJECTED);
    }

}
