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

  private static Socket server;
  private static DataInputStream listener;
   private static PrintStream sender;
  
  private SimpleStringProperty gameMoveResponse = new SimpleStringProperty();
  private SimpleStringProperty gameResultResponse = new SimpleStringProperty();
  private SimpleStringProperty loginResponse = new SimpleStringProperty();
  private SimpleStringProperty registrationResponse = new SimpleStringProperty();
    
  static{
      
        try {
            server = new Socket("localhost",4004);
            listener = new DataInputStream(server.getInputStream());
            sender = new PrintStream(server.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Remote.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  }
    private static Remote instance;
    @Override
    public void run() {
        super.run();
        
           try {
               
            
            
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
    
    


   
    
   
    public void sendGameMoveRequest(String playerTwoName,int row , int column)
    {
    
        try{
           sender.println("acceptMoveRequest"+" "+playerTwoName +" "+String.valueOf(row)+" "+String.valueOf(column));
        }catch(Exception e)
        {
        
        }
    
    }
    
    private void recieveGameMoveResponse(String response)
    {
      String splited[] = response.split(" ");
      gameMoveResponse.set(splited[1]+" "+splited[2]);
    
    }
    
    
    public void sendGameResultRequest(String playerOneName,String playerTwoName, String gameResult)
    {
        try{
                 sender.println("acceptGameResult"+" "+playerOneName +" "+playerTwoName+" "+gameResult);
        }catch(Exception e)
        {

        }
    
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
    
    
    
    
    
   
    

