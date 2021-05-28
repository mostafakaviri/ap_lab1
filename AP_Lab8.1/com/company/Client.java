package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.*;

public class Client {

    public static void main(String[] args){

        try {
            Socket clientSocket = new Socket("127.0.0.1", 5757);

            OutputStream out = clientSocket.getOutputStream();
            InputStream in = clientSocket.getInputStream();

            byte [] buffer ;

            String memory = "";

            Scanner scan = new Scanner(System.in);

            while (!memory.equals("over")){
                ArrayList<String> memory1 = new ArrayList<>();
                buffer = new byte[4096];

                System.out.println("Write your text:");
                byte [] ex ;
                ex = scan.nextLine().getBytes();
                System.out.println("Sending massage to server");
                out.write(ex);
                Thread.sleep(500);

                System.out.print("Receiving server response");
                Thread.sleep(500);

                int read;

                read = in.read(buffer);
                memory = new String(buffer,0,read);
                memory1.add(memory);
                System.out.print(".");
                Thread.sleep(100);

                System.out.println();

                System.out.println("Response:");
                for (String a : memory1){
                    System.out.println(a);
                }
                System.out.println("End of response");
                //System.out.println(memory);
            }

            clientSocket.close();
            System.exit(0);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
