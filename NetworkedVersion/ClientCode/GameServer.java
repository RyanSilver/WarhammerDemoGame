/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josh
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class GameServer
{
    
   public static void main(String argv[]) throws Exception
      {
         ServerSocket welcomeSocket = new ServerSocket(6789);
         Socket connectionSocket = null;
         connectionSocket  = welcomeSocket.accept();
         window.setStatusUpdate(Boolean.toString(connectionSocket.isConnected()));
         //InputStream is = connectionSocket.getInputStream();
         //ObjectInputStream ois = new ObjectInputStream(is);
         //ois.readObject();
         //Scanner s = new Scanner(is).useDelimiter("\\A");
         //String result = s.hasNext() ? s.next() : "";
        // System.out.println("result");
      }
}