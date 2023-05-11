/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.data.stream_messages;

/**
 *
 * @author 3WD
 */
public class ClientMessage {
    public static final String HEADER = "AvailablePlayers";
    public static final String GET = "GET";
    public static final String SEND_REQUEST = "SEND_REQUEST";
    public static final String ACCEPT_GAME_REQUEST = "ACCEPT_GAME_REQUEST";
    public static final String REJECT_GAME_REQUEST = "REJECT_GAME_REQUEST";
    public static final String DENY = "DENY";
    
}

