package sample.classes;

import javafx.scene.control.TextField;

import java.awt.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void connect(User user){
        try{
            Socket socket = new Socket("127.0.0.1", 1111);
            ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
           //
            if(user != null){
                toServer.writeObject(user);
            }
            socket.close();
            toServer.close();

        }catch (Exception e){
            e.printStackTrace();
        }}

        }



