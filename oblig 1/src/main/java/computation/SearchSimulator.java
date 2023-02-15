package computation;

import utils.ResponseGenerator;

import java.io.PrintWriter;
import java.net.Socket;

public class SearchSimulator {

    public static void processClientRequest(Socket socket) throws Exception {

        long time1 = System.currentTimeMillis();
        System.out.println("Request processing started at:   " + time1);

        Thread.sleep( 8*1000);

        long time2 = System.currentTimeMillis();
        System.out.println("Request processing ended at:   " + time2);

        String responseBody = ResponseGenerator.generatorResponseHTML(time1, time2);
        String responseHeader = ResponseGenerator.generatorResponseHeader(responseBody.length());

        new PrintWriter(socket.getOutputStream(), true).println(responseHeader + responseBody);
    }
}