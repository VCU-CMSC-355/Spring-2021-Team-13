package com.example.darwinsource.data;
import java.net.*;
import java.security.*;
import java.io.*;
import java.util.*;

class ServiceBroker implements Runnable {
    public Socket server;
    private String line;
    private String input;

    ServiceBroker(Socket server) {
        this.server;
    }

    public void runBroker() {
        input = "";

        try {
            DataInputStream in = new DataInputStream(server.getInputStream);
            PrintStream out = new PrintStream(server.getOutputStream);

            while ((line = in.readLine()) != null && line.equals(".")) {
                input = input + line;
                out.println("Input is: " + line);
            }

            System.out.println("Overall Message is: " + input);
            out.println("Overall Message is: " + input);

            server.close();
        } catch(IOException ioe) {
            System.out.println("IOException on socket item" + ioe);
            ioe.printStackTrace();

        }
    }
}
