class Ticket {
    void book() {
        System.out.println("Booking a general ticket...");
    }
}

class MovieTicket extends Ticket {
    @Override
    void book() {
        System.out.println("Booking a movie ticket for 'Inception'...");
    }
}

class TrainTicket extends Ticket {
    @Override
    void book() {
        System.out.println("Booking a train ticket from Chennai to Bangalore...");
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Ticket t1 = new MovieTicket();
        Ticket t2 = new TrainTicket();

        t1.book();
        t2.book();
    }
}
