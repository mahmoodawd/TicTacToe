/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.data.repositories;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import tictactoe.available_players.data.stream_messages.*;
import tictactoe.available_players.domain.repositories.AvailablePlayersRepoInterface;
import tictactoe.available_players.domain.model.Player;

/**
 *
 * @author ASUS
 */
public class AvailablePlayersRepoImp {

    List<Player> availablePlayers;
    private static Socket server;
    private CountDownLatch connectionLatch = new CountDownLatch(1);
    private static DataInputStream listener;
    private static PrintStream sender;
    boolean playRequestStatus;
    boolean isHaveRequest = false;

    private void connect() {
        new Thread((() -> {

            try {
                server = new Socket("localhost", 4004);
                listener = new DataInputStream(server.getInputStream());
                sender = new PrintStream(server.getOutputStream());
                System.out.println("Connection Established & Streams Are Ready for data transfer");
                connectionLatch.countDown();

            } catch (IOException ex) {
                Logger.getLogger(AvailablePlayersRepoImp.class.getName()).log(Level.SEVERE, null, ex);
            }

        })).start();

    }

    public AvailablePlayersRepoImp() {
        availablePlayers = new ArrayList<>();
    }

    public List<Player> getAvailablePlayers() {
        fetchPlayersListFromServer();
        List<Player> players = new ArrayList();
        players.addAll(availablePlayers);
        return players;
    }

    public boolean sendRequest(String requesterName, String receiverName) {
        try {
            connectionLatch.await(); // Wait for the connection to be established
            sender.println(ClientMessage.HEADER + " " + ClientMessage.SEND_REQUEST + " " + requesterName + " " + receiverName);
//            getServerResponse();
        } catch (InterruptedException ex) {
            Logger.getLogger(AvailablePlayersRepoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playRequestStatus;
    }

    public void acceptRequest() {
        try {
            connectionLatch.await(); // Wait for the connection to be established
            sender.println(ClientMessage.HEADER + " " + ClientMessage.ACCEPT_GAME_REQUEST);
        } catch (InterruptedException ex) {
            Logger.getLogger(AvailablePlayersRepoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void denyRequest() {
        try {
            connectionLatch.await(); // Wait for the connection to be established
            sender.println(ClientMessage.HEADER + " " + ClientMessage.DENY);
        } catch (InterruptedException ex) {
            Logger.getLogger(AvailablePlayersRepoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean listenForRequest() {
        //shoudl Listen for changing
        return isHaveRequest;
    }

   /* private boolean getServerResponse() {
        boolean fetchStatus = false;
        String serverMsg, header, body = null;
        String playerName;
        connect();
        try {
            connectionLatch.await();
            serverMsg = listener.readLine();
            header = serverMsg.split(" ")[0];
            if (header.equals(ServerMessage.HEADER)) {
                body = serverMsg.split(" ")[1];
                switch (body) {
                    case ServerMessage.NO_DATA:
                        fetchStatus = false;
                        break;
                    case ServerMessage.POST:
                        do {
                            playerName = listener.readLine();
                            availablePlayers.add(new Player(playerName));
                        } while (!playerName.equals(ServerMessage.END));
                        fetchStatus = true;
                        break;
                    case ServerMessage.ACCEPTED:
                        playRequestStatus = true;
                        break;
                    case ServerMessage.DENIED:
                        playRequestStatus = false;
                        break;
                    case ServerMessage.SEND_REQUEST:
                        isHaveRequest = true;
                        break;
                }
            }
        } catch (InterruptedException | IOException ex) {
            Logger.getLogger(AvailablePlayersRepoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fetchStatus;
    }*/

    private void fetchPlayersListFromServer() {
        try {
            connectionLatch.await(); // Wait for the connection to be established
            sender.println(ClientMessage.HEADER + " " + ClientMessage.GET);
//            getServerResponse();
        } catch (InterruptedException ex) {
            Logger.getLogger(AvailablePlayersRepoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
