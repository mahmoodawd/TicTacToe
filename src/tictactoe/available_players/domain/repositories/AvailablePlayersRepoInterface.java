/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.available_players.domain.repositories;

import java.util.List;
import tictactoe.available_players.domain.model.Player;


/**
 *
 * @author ASUS
 */
public interface AvailablePlayersRepoInterface {
    
List<Player> getAvailablePlayers();
}
