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
import java.util.logging.Level;
import java.util.logging.Logger;
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

    static {

        try {
            server = new Socket("localhost", 4004);
            listener = new DataInputStream(server.getInputStream());
            sender = new PrintStream(server.getOutputStream());
            Remote.getIntance().start();
        } catch (IOException ex) {
            Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
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

                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                listener.close();
                sender.close();
                server.close();
            } catch (IOException ex) {
                Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            sender.println("acceptGameResult" + " " + playerOneName + " " + playerTwoName + " " + gameResult);
        } catch (Exception e) {

        }

    }

    private void recieveGameResultResponse(String response) {
        gameResultResponse.set(" ");
        gameResultResponse.set(response);
    }

    public static synchronized Remote getIntance() {

        if (instance == null) {

            instance = new Remote();

        }

        return instance;
    }

    public void sendRegistrationCridentials(String... validate) {
        sender.println("Register " + validate[0] + " " + validate[1]);
    }

    public void sendLoginCridentials(String... check) {
        sender.println("Login" + " " + check[0] + " " + check[1]);
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

        try {

            for (int i = 0; i < players.length; i++) {
                playerName = listener.readLine();
                availablePlayers.add(playerName);
            }

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return fetchStatus;
    }

    public void requestPlayersListFromServer() {
        sender.println(ClientMessage.HEADER + " " + ClientMessage.GET);
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
        sender.println(ClientMessage.SEND_REQUEST
                + " " + requesterName + " " + receiverName);
    }

    private void handleRequest(String input) {
        System.out.println("HandleRequest On Client");
        playerTwoName.set(input.split(" ")[1]);

    }

    private void handleGameRequest(String input) {

    }

    public void acceptRequest(String playerOne, String playerTwo) {
        System.out.println("acceptGameRequest on Remote");
        sender.println(ClientMessage.ACCEPT_GAME_REQUEST
                + " " + playerOne + " " + playerTwo);
    }

    public void rejectRequest(String playerOne, String playerTwo) {
        System.out.println("acceptGameRequest on Remote");
        sender.println(ClientMessage.REJECT_GAME_REQUEST
                + " " + playerOne + " " + playerTwo);
    }

    public SimpleStringProperty getDenied() {
        return denied;
    }

    private void denyGameResponse(String input) {

        denied.set(input.split(" ")[0]);
    }

}
