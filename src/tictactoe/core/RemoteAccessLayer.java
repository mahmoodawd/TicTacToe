/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class RemoteAccessLayer {
    static RemoteAccessLayer instance ; 
    private static  Socket server;
    
    
    private RemoteAccessLayer()
    {
    
    
    }
    
    
    
    public static synchronized RemoteAccessLayer getInstance()
    {
        
        if(instance == null){
            instance = new RemoteAccessLayer();
        }
        return instance;
    } 
    
    
    public void initConnection() throws IOException
    {
         server = new Socket();
       server.connect(new InetSocketAddress("192.168.1.1", 8000));
    }
    
    
    //todo implement your server functions
}
