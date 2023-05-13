/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tictactoe.available_players.data.stream_messages.ClientMessage;
import tictactoe.available_players.data.stream_messages.ServerMessage;

public class Remote extends Thread {

    private static Socket server;
    private static DataInputStream listener;
    private static PrintStream sender;

    private SimpleStringProperty gameMoveResponse = new SimpleStringProperty();
    private SimpleStringProperty gameResultResponse = new SimpleStringProperty();
    private SimpleStringProperty loginResponse = new SimpleStringProperty();
    private SimpleStringProperty registrationResponse = new SimpleStringProperty();
    ObservableList<String> availablePlayers;
    private SimpleStringProperty playerTwoName = new SimpleStringProperty();
    private SimpleStringProperty senderName = new SimpleStringProperty();
    private SimpleStringProperty denied = new SimpleStringProperty();
    private SimpleStringProperty replayRequest = new SimpleStringProperty();
    private SimpleStringProperty replayResponse = new SimpleStringProperty();
    private SimpleBooleanProperty connectionState = new SimpleBooleanProperty();

    private void init() {

        if (!connectionState.get()) {
            try {
                server = new Socket("localhost", 4004);
                listener = new DataInputStream(server.getInputStream());
                sender = new PrintStream(server.getOutputStream());
                Remote.getIntance().start();
                connectionState.set(true);
            } catch (Exception ex) {
                try {
                    if (server != null) {
                        server.close();
                        listener.close();
                        sender.close();
                        connectionState.set(false);
                    }
                } catch (IOException ex1) {
                  
                }

            }
        }

    }

    private Remote() {
        availablePlayers = FXCollections.observableArrayList();
    }
    private static Remote instance;

    @Override
    public void run() {
        super.run();

        try {
            while (true) {

                String input = listener.readLine();
                System.out.println("response " + input);
                if (input != null) {

                    switch (input.split(" ")[0]) {

                        case "acceptMoveResponse": {

                            recieveGameMoveResponse(input);
                            break;
                        }

                        case "gameResultResponse": {

                            recieveGameResultResponse(input);
                            break;
                        }
                        case "Login": {
                            recieveLoginResponse(input);
                            break;
                        }
                        case "Register": {
                            recieveRegistrationResponse(input);
                            break;
                        }
                        case "AvailablePlayers":
                            fillOnlineList(input);
                            break;
                        case ServerMessage.RECEIVE_GAME_REQUEST:
                            handleRequest(input);
                            break;
                        case ServerMessage.DENIED_GAME_RESPONSE:
                            denyGameResponse(input);
                            break;
                        case "forwardReplayRequest":
                            handleForwardedReplayRequest(input);
                            break;
                        case "replayResponse":
                            handleReplayResponse(input);
                            break;

                    }
                }

            }
        } catch (SocketException ex) {
            try {
                listener.close();
                this.stop();
            
            } catch (IOException ex1) {
                Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*  private Remote(){
        try {
            listener = new DataInputStream(server.getInputStream());
            sender = new PrintStream(server.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    public SimpleStringProperty getLoginResponse() {
        return loginResponse;
    }

    public void setLoginResponse(SimpleStringProperty loginResponse) {
        this.loginResponse = loginResponse;
    }

    public SimpleStringProperty getRegistrationResponse() {
        return registrationResponse;
    }

    public void setRegistrationResponse(SimpleStringProperty registrationResponse) {
        this.registrationResponse = registrationResponse;
    }

    public SimpleStringProperty getGameResultResponse() {
        return gameResultResponse;
    }

    public SimpleStringProperty getGameMoveResponse() {
        return gameMoveResponse;
    }

    public void sendGameMoveRequest(String playerTwoName, int row, int column) {

        try {
            init();
            sender.println("acceptMoveRequest" + " " + playerTwoName + " " + String.valueOf(row) + " " + String.valueOf(column));
        } catch (Exception e) {

        }

    }

    private void recieveGameMoveResponse(String response) {
        String splited[] = response.split(" ");
        gameMoveResponse.set(splited[1] + " " + splited[2]);

    }

    public void sendGameResultRequest(String playerOneName, String playerTwoName, String gameResult) {
        try {
            init();
            sender.println("acceptGameResult" + " " + playerOneName + " " + playerTwoName + " " + gameResult);
        } catch (Exception e) {

        }

    }

    private void recieveGameResultResponse(String response) {
        gameResultResponse.set("");
        gameResultResponse.set(response.split(" ")[1]);
    }

    public static synchronized Remote getIntance() {

        if (instance == null) {

            instance = new Remote();

        }

        return instance;
    }

    public void sendRegistrationCridentials(String... validate) {
        try {
            init();
            sender.println("Register " + validate[0] + " " + validate[1]);
        } catch (Exception e) {

        }
    }

    public void sendLoginCridentials(String... check) {
        System.out.println("login");
        try {
            init();
            sender.println("Login" + " " + check[0] + " " + check[1]);
        } catch (Exception e) {

            System.out.println("login exception " + e.getMessage());
        }

    }

    private void recieveLoginResponse(String response) {
        System.out.println("recieve ");
        loginResponse.set(" ");
        loginResponse.set(response);
    }

    private void recieveRegistrationResponse(String response) {
        registrationResponse.set(response);
    }

    private boolean fillOnlineList(String serverMsg) {
        boolean fetchStatus = false;
        String players[] = serverMsg.split(" ");
        String playerName = "";

        for (int i = 1; i < players.length; i++) {
            System.out.println("Fill List" + playerName);
            availablePlayers.add(players[i]);
        }
        return fetchStatus;
    }

    public void requestPlayersListFromServer() {
        try {
            init();
            sender.println(ClientMessage.HEADER + " " + ClientMessage.GET);

        } catch (Exception e) {

        }
    }

    public ObservableList<String> getAvailablePlayers() {
//        List<String> players = new ArrayList<>();
//        requestPlayersListFromServer();
//        players.addAll(availablePlayers);
//        return players;
        return availablePlayers;
    }

    public SimpleStringProperty getPlayerTwoName() {
        return playerTwoName;
    }

    public void sendRequest(String requesterName, String receiverName) {
        System.out.println("SendRequest On Client");
        try {
            init();
            sender.println(ClientMessage.SEND_REQUEST
                    + " " + requesterName + " " + receiverName);
        } catch (Exception e) {

        }
    }

    private void handleRequest(String input) {
        System.out.println("HandleRequest On Client");
        playerTwoName.set(input.split(" ")[1]);

    }

    private void handleGameRequest(String input) {

    }

    public void acceptRequest(String playerOne, String playerTwo) {
        System.out.println("acceptGameRequest on Remote");
        try {
            init();
            sender.println(ClientMessage.ACCEPT_GAME_REQUEST
                    + " " + playerOne + " " + playerTwo);
        } catch (Exception e) {

        }
    }

    public void rejectRequest(String playerOne, String playerTwo) {
        System.out.println("acceptGameRequest on Remote");
        try {

            init();
            sender.println(ClientMessage.REJECT_GAME_REQUEST
                    + " " + playerOne + " " + playerTwo);
        } catch (Exception e) {

        }
    }

    public SimpleStringProperty getDenied() {
        return denied;
    }

    private void denyGameResponse(String input) {

        denied.set(input.split(" ")[0]);
    }

    public void sendReplayRequest(String senderName, String receiverName) {
        try {
            init();
            sender.println("ReplayRequest" + " " + senderName + " " + receiverName);
        } catch (Exception e) {

        }
    }

    private void handleForwardedReplayRequest(String input) {
        replayRequest.set("");
        replayRequest.set(input.split(" ")[1]);
    }

    public SimpleStringProperty getReplayRequest() {
        return replayRequest;
    }

    public void replayResponse(String response) {

        try {
            init();
            sender.println("ReplayResponse" + " " + replayRequest.get() + " " + response);
        } catch (Exception e) {

        }
    }

    private void handleReplayResponse(String input) {
        replayResponse.set(input.split(" ")[1]);
    }

    public SimpleStringProperty getReplayResponse() {

        return replayResponse;
    }

    public void sendOfflineRequest() {
        try {
            init();
            sender.println("Offline");
            sender.close();
            listener.close();
            server.close();
        } catch (Exception e) {

        }
    }

}
