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
import static tictactoe.core.LocalAccessLayer.instance;

public class Remote extends Thread{

    
    private static Remote instance;
    @Override
    public void run() {
        super.run();
        
           try {
            server = new Socket("192.168.1.21",4004);
            listener = new DataInputStream(server.getInputStream());
            sender = new PrintStream(server.getOutputStream());
            
            
             while(true)
             {
               String input = listener.readLine();
               switch(input.split(" ")[0])
               {
               
               
                   case "gameMoveResponse":
                   {
                   
                       recieveGameMoveResponse(input);
                        break;
                   }
                   
                   
                   case "gameResultResponse":
                   {
                   
                       recieveGameResultResponse(input);
                       break;
                   }
                   
               
               
               }
             
             
             }
        } catch (IOException ex) {
            Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                listener.close();
                sender.close();
                server.close();
            } catch (IOException ex) {
                Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        
    }

  private Socket server;
  private DataInputStream listener; 
  private PrintStream sender ;
  private SimpleStringProperty gameMoveResponse = new SimpleStringProperty();
  private SimpleStringProperty gameResultResponse = new SimpleStringProperty();

   
  
    
    
    
     public SimpleStringProperty getGameResultResponse() {
        return gameResultResponse;
    }

  
    
    
    public SimpleStringProperty getGameMoveResponse() {
        return gameMoveResponse;
    }
    
    


   
    
   
    public void sendGameMoveRequest(String playerTwoName,int row , int column)
    {
    
        sender.println("acceptMoveRequest"+" "+playerTwoName +" "+String.valueOf(row)+" "+String.valueOf(column));
    
    }
    
    private void recieveGameMoveResponse(String response)
    {
      String splited[] = response.split(" ");
      gameMoveResponse.set(splited[1]+" "+splited[2]);
    
    }
    
    
    public void sendGameResultRequest(String playerOneName,String playerTwoName, String gameResult)
    {
    
     sender.println("acceptGameResult"+" "+playerOneName +" "+playerTwoName+" "+gameResult);
    
    }
    
    
    private void recieveGameResultResponse(String response)
    {
       gameResultResponse.set(" ");
       gameResultResponse.set(response);
    }
    
    
    public static synchronized Remote getIntance()
    {
    
        if(instance == null)
        {
        
        
            instance = new Remote();
        
        
        }
    
    return instance;
    }
    
    
   
    
}
