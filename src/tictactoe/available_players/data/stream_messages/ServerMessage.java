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
public class ServerMessage {

    public static final String HEADER = "AvailablePlayers";
    public static final String POST = "POST";
    public static final String END = "END";
    public static final String NO_DATA = "NO_DATA";
    public static final String ACCEPTED_GAME_RESPONSE = "acceptedGameResponse";
    public static final String DENIED_GAME_RESPONSE = "deniedGameResponse";
    public static final String SEND_REQUEST = "Request";
    public static final String RECEIVE_GAME_REQUEST = "ReceiveGameRequest";

}
