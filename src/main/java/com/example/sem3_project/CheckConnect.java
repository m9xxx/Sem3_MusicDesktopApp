package com.example.sem3_project;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CheckConnect extends Thread{
    public boolean connected;
    public String status;
    public boolean heheheha = true;
    @Override
    public void run() {
        while (heheheha){
            try {
                URL url = new URL("http://www.google.com");
                URLConnection connection = url.openConnection();
                connection.connect();
                System.out.println("Internet is connected");
                connected = true;
                status = "All good";
                try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            } catch (MalformedURLException e) {
                System.out.println("Internet is not connected");
                connected = false;
                status = "No connection";
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            } catch (IOException e) {
                System.out.println("Internet is not connected");
                connected = false;
                status = "No connection";
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }

//            try {
//                InetAddress.getByName("youtube.com").isReachable(2000);
//                connected = true;
//            } catch (Exception e)
//            {
//                connected = false;
//            }
//            try {
//                sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
