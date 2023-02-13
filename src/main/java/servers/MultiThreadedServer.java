package servers;

import computation.AsyncSearchSimulator;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer implements Runnable {

    protected int serverPort = 8080;
    protected ServerSocket serverSocket = null;
    protected boolean isStopped = false;

    public MultiThreadedServer(int port) {
        this.serverPort = port;
    }

    public void run() {

        openServerSocket();
        Socket clientSocket;

        while (!isStopped()) {
            // wait for a connection

            try {

                clientSocket = serverSocket.accept();

                // on receiving a request, execute the heavy computation in a new thread
                new Thread(
                        new AsyncSearchSimulator(
                                clientSocket,
                                "Multithreaded Server"
                        )
                ).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Server Stopped . ");
    }

    private synchronized boolean isStopped() {
        return this.isStopped;
    }

    public synchronized void stop() {
        // implementation to stop the server from the main thread if needed
        try {
            serverSocket.close();

        } catch (Exception e) {

        }
    }
    private void openServerSocket() {
        try {
            serverSocket = new ServerSocket(serverPort);
        } catch (IOException e) {
            throw new RuntimeException("Cannot open port " + serverPort, e);
        }
    }
}