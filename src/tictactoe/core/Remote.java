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

public class Remote extends Thread{

  private Socket server;
  private DataInputStream listener; 
  private PrintStream sender ;
  private SimpleStringProperty gameMoveResponse = new SimpleStringProperty();
  private SimpleStringProperty gameResultResponse = new SimpleStringProperty();
  private SimpleStringProperty loginResponse = new SimpleStringProperty();
  private SimpleStringProperty registrationResponse = new SimpleStringProperty();

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

   
  
    
    public Remote()
    {
    
        try {
            server = new Socket("localhost",4004);
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
                   case "Login":{
                       recieveLoginResponse(input);
                       break;
                   }
                   case "Register":{
                       recieveRegistrationResponse(input);
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
    
    public void sendRegistrationCridentials(String ... validate){
        sender.println("Register "+validate[0]+" "+validate[1]);
    }
    public void sendLoginCridentials(String ... check ){
        sender.println("Login "+check[0]+" "+check[1]);
    }
    
    private void recieveLoginResponse(String response){
      loginResponse.set(response);
    }
    private void recieveRegistrationResponse(String response){
      registrationResponse.set(response);
    }
    
    
    
    
   
    
}
