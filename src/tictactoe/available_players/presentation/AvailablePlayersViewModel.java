/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.presentation;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tictactoe.available_players.data.repositories.AvailablePlayersRepoImp;
import tictactoe.available_players.domain.model.Player;

/**
 *
 * @author 3WD
 */
public class AvailablePlayersViewModel {

    AvailablePlayersRepoImp availablePlayersRepo;
    ObservableList<Player> availablePlayers;
    private final SimpleObjectProperty<RequestStatus> requestStatus = new SimpleObjectProperty<>();
    private Player requester;
    private final SimpleBooleanProperty haveRequest;

    public AvailablePlayersViewModel() {
        availablePlayersRepo = new AvailablePlayersRepoImp();
        haveRequest = new SimpleBooleanProperty(false);
        availablePlayers = FXCollections.observableArrayList();
        availablePlayers.addAll(availablePlayersRepo.getAvailablePlayers());
    }

    public ObservableList<Player> getAvailablePlayers() {
        return availablePlayers;
    }

    public SimpleObjectProperty<RequestStatus> getRequestStatus() {
        return requestStatus;
    }
    public SimpleBooleanProperty isHaveRequest() {
        return haveRequest;
    }

    public void sendRequest(Player receiver) {
        requestStatus.set(availablePlayersRepo.sendRequest(requester, receiver)
                ? RequestStatus.ACCEPTED : RequestStatus.REJECTED);
    }


    private void listenForRequest() {
        haveRequest.set(availablePlayersRepo.listenForRequest());

    }

    public void addNewPlayer(Player player) {
        ObservableList<Player> updatedPlayersList = availablePlayers;
        updatedPlayersList.add(player);
        availablePlayers.setAll(updatedPlayersList);
    }

}
