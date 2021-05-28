package multiThreadedServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class Server {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        int counter = 0;
        try (ServerSocket welcomingSocket = new ServerSocket(5757)) {
            System.out.print("Server started.\n");
            System.out.println("Waiting for a client ... ");
            while (counter < 5) {

                Socket connectionSocket = welcomingSocket.accept();
                counter++;
                System.out.println("client accepted!");
                pool.execute(new ClientHandler(connectionSocket, counter));
            }
            pool.shutdown();
            welcomingSocket.close();
            System.out.print("done.\nClosing server ... ");
        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println("done.");
    }

}

class ClientHandler implements Runnable {

    private Socket connectionSocket;
    private int clientNum;

    public ClientHandler(Socket connectionSocket, int clientNum) {
        this.connectionSocket = connectionSocket;
        this.clientNum=clientNum;
    }

    @Override
    public synchronized void run() {
        try {
            OutputStream out = connectionSocket.getOutputStream();
            InputStream in = connectionSocket.getInputStream();

            byte[] buffer = new byte[4096];
            ArrayList<String> messages = new ArrayList<>();

            int counter = 0;

            while (true){

                int read = in.read(buffer);

                if (counter == 5){
                    String endMessage = "over";
                    out.write(endMessage.getBytes());
                    connectionSocket.close();
                    break;
                }
                System.out.println("RECV from "+clientNum+": " + new String(buffer, 0, read));
                messages.add(new String(buffer,0,read));
                for (String msg : messages){
                    out.write(msg.getBytes());
                    out.write('\n');
                }
                System.out.println("Messages sent to client");
                Thread.sleep(100);
                counter++;

            }

            System.out.print("All messages sent.\nClosing client ...\n ");
            System.out.println("Waiting for a client ... ");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                connectionSocket.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }
}
