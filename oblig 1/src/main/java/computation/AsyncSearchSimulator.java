package computation;

import utils.ResponseGenerator;

import java.io.PrintWriter;
import java.net.Socket;

public class AsyncSearchSimulator implements Runnable {

    protected Socket clientSocket = null;
    protected String serverText = null;

    public AsyncSearchSimulator(Socket clientSocket, String serverText) {
        this.clientSocket = clientSocket;
        this.serverText = serverText;
    }

    public void run() {

        /* Uses the responsegenerator to create a response. */
        try {
            long time1 = System.currentTimeMillis();
            Thread.sleep( 8*1000);

            long time2 = System.currentTimeMillis();

            String responseBody = ResponseGenerator.generatorResponseHTML(time1, time2);
            String responseHeader = ResponseGenerator.generatorResponseHeader(responseBody.length());

            new PrintWriter(clientSocket.getOutputStream(), true).println(responseHeader + responseBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}