package com.example.sem3_project;

import java.net.InetAddress;

public class CheckConnect extends Thread{
    public boolean connected;
    public boolean heheheha = true;
    @Override
    public void run() {
        while (heheheha){
            try {
                InetAddress.getByName("google.com").isReachable(2000);
                connected = true;
            } catch (Exception e)
            {
                connected = false;
            }
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
