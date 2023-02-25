package booking;

public class MovieTicketClient extends Thread {
    private String customerName;
    private int numberOfTickets;
    private MovieTicketServer ticketServer;

    public MovieTicketClient(MovieTicketServer ticketServer,String customerName, int numberOfTickets) {
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
        this.ticketServer = ticketServer;
    }

    public void run() {
        ticketServer.bookTicket(customerName, numberOfTickets);
    }
}