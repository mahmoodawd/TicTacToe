/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.presentation;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.RadioButton;
import tictactoe.available_players.data.repositories.AvailablePlayersRepoImp;
import tictactoe.available_players.domain.model.Player;
import tictactoe.core.Remote;

/**
 *
 * @author 3WD
 */
public class AvailablePlayersViewModel {

    Remote remote;
    ObservableList<String> availablePlayers;
    private final SimpleObjectProperty<RequestStatus> requestStatus = new SimpleObjectProperty<>();
    private Player requester;
    private final SimpleBooleanProperty haveRequest;
    private SimpleStringProperty requestSender = new SimpleStringProperty();

    public AvailablePlayersViewModel() {

        remote = Remote.getIntance();
        haveRequest = new SimpleBooleanProperty(false);
        availablePlayers = FXCollections.observableArrayList();
        observeAvailablePlayersfromRemote();
    }

    void func() {
        remote.requestPlayersListFromServer();

    }

    void reloadPlayerList() {
        availablePlayers.addAll(Remote.getIntance().getAvailablePlayers());
    }

    public ObservableList<String> getAvailablePlayers() {
        return availablePlayers;
    }

    public SimpleObjectProperty<RequestStatus> getRequestStatus() {
        return requestStatus;
    }

    public SimpleBooleanProperty isHaveRequest() {
        return haveRequest;
    }

    public void sendRequest(String requester, String receiver) {

        remote.sendRequest(requester, receiver);
    }


    /*private void listenForRequest() {
        haveRequest.set(remote.listenForRequest());

    }*/
    public void addNewPlayer(String playerName) {
        ObservableList<String> updatedPlayersList = availablePlayers;
        updatedPlayersList.add(playerName);
        availablePlayers.setAll(updatedPlayersList);
    }

    public void observeAvailablePlayersfromRemote() {
//        availablePlayers.add("Ahmed");
        remote.getAvailablePlayers().addListener((ListChangeListener.Change<? extends String> change) -> {
            while (change.next()) {
                if (change.wasAdded()) {
                    availablePlayers.addAll(change.getAddedSubList());
                }
            }
        });
    }

    public SimpleStringProperty getRequestSender() {
        return requestSender;
    }

    public void observeSenderNamefromRemote() {
        remote.getRequestSender().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            requestSender.set(newValue);

        });
    }

}
