package servers;

import computation.SearchSimulator;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreadedServer implements Runnable {

    protected int serverPort = 8080;
    protected ServerSocket serverSocket = null;
    protected boolean isStopped = false;

    public SingleThreadedServer(int port) {

        this.serverPort = port;
    }

    public void run() {
        openServerSocket();
        Socket clientSocket;
        while (!isStopped()) {
            try {

                clientSocket = serverSocket.accept();

                processClientRequest(clientSocket);

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

    private void processClientRequest(Socket clientSocket) throws Exception {
        SearchSimulator.processClientRequest(clientSocket);
    }
}