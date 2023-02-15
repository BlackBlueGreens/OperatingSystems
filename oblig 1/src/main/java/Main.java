
import servers.MultiThreadedServer;
import servers.SingleThreadedServer;

public class Main {

    //true = singleThread, false= multithread
    private static boolean singleThread = false;
    private static int serverPort = 8080;


    public static void main(String[] args) {
        System.out.println("Starting server");
        // Start your server here
        if (singleThread) {
            new SingleThreadedServer(serverPort).run();

        } else{
            new MultiThreadedServer(serverPort).run();
        }
    }
}