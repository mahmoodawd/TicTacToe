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
    private SimpleStringProperty playerOneName = new SimpleStringProperty();
    private SimpleStringProperty playerTwoName = new SimpleStringProperty();
    private SimpleStringProperty denied = new SimpleStringProperty();
    private final SimpleBooleanProperty haveRequest;
    private boolean requestSent;

    public boolean isRequestSent() {
        return requestSent;
    }

    public void setRequestSent(boolean requestSent) {
        this.requestSent = requestSent;
    }

    public AvailablePlayersViewModel() {

        remote = Remote.getIntance();
        haveRequest = new SimpleBooleanProperty(false);
        requestSent = false;
        availablePlayers = FXCollections.observableArrayList();
        observeAvailablePlayersfromRemote();
        observeDeniedFromRemote();
        observePlayerTwoNamefromRemote();

    }

    public SimpleStringProperty getPlayerOneName() {
        return playerOneName;
    }

    public void setPlayerOneName(String ownerName) {
        playerOneName.set(ownerName);
    }

    public SimpleStringProperty getPlayerTwoName() {
        return playerTwoName;
    }

    public SimpleStringProperty getDenied() {
        return denied;
    }

    public void setPlayerTwoName(String receiverName) {
        this.playerTwoName.set(receiverName);
    }

    void requestPlayersList() {
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

    public void sendRequest(String receiverName) {

        remote.sendRequest(playerOneName.get(), receiverName);
        requestSent = true;

    }

    void acceptGameRequest() {
        System.out.println("acceptGameRequest on ViewModel");
        remote.acceptRequest(playerOneName.get(), playerTwoName.get());
    }

    void rejectGameRequest() {
        System.out.println("acceptGameRequest on ViewModel");
        remote.rejectRequest(playerOneName.get(), playerTwoName.get());
    }

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

    public void observePlayerTwoNamefromRemote() {
        remote.getPlayerTwoName().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            System.out.println("ObservePlayer2Name on ViewModel");
            playerTwoName.set(newValue);

        });
    }

    private void observeDeniedFromRemote() {
        remote.getDenied().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            denied.set(newValue);

        });
    }

    void clearPlayersList() {
        availablePlayers.clear();
    }

    public AvailablePlayersViewModel(SimpleBooleanProperty haveRequest) {
        this.haveRequest = haveRequest;
    }
    
    public void logOut(){
        remote.sendOfflineRequest();
    }

}
