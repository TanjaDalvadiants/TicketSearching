import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
//    TicketRepository repo = new TicketRepository();
//    TicketManager manager = new TicketManager(repo);
//    Ticket ticket1 = new Ticket(1, "SRT", "MSK",200, 120 );
//    Ticket ticket2 = new Ticket(2, "SRT", "MSK",300, 60 );
//    Ticket ticket3 = new Ticket(3, "SPB", "MSK",500, 30 );
//    Ticket ticket4 = new Ticket(4, "SPB", "MSK",200, 93 );
//    Ticket ticket5 = new Ticket(5, "SRT", "SPB",800, 180 );
//    Ticket ticket6 = new Ticket(6, "SRT", "SPB",200, 360 );
//    Ticket ticket7 = new Ticket(7, "MSK", "SRT",300, 93 );
//    Ticket ticket8 = new Ticket(8, "SPB", "SRT",800, 93 );

    //    @BeforeEach
//    public void setup() {
//        manager.add(ticket1);
//        manager.add(ticket2);
//        manager.add(ticket3);
//        manager.add(ticket4);
//        manager.add(ticket5);
//        manager.add(ticket6);
//        manager.add(ticket7);
//        manager.add(ticket8);
//    }
    @Test
    public void ShouldSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "SRT", "MSK", 200, 120);
        Ticket ticket2 = new Ticket(2, "SRT", "MSK", 300, 60);
        Ticket ticket3 = new Ticket(3, "SPB", "MSK", 500, 30);
        Ticket ticket4 = new Ticket(4, "SPB", "MSK", 200, 93);
        Ticket ticket5 = new Ticket(5, "SRT", "SPB", 800, 180);
        Ticket ticket6 = new Ticket(6, "SRT", "SPB", 200, 360);
        Ticket ticket7 = new Ticket(7, "MSK", "SRT", 300, 93);
        Ticket ticket8 = new Ticket(8, "SPB", "SRT", 800, 93);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket1, ticket2};
        Ticket[] actual = manager.searchBy("SRT", "MSK");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldSortTicketsIfNotFound() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "SRT", "MSK", 200, 120);
        Ticket ticket2 = new Ticket(2, "SRT", "MSK", 300, 60);
        Ticket ticket3 = new Ticket(3, "SPB", "MSK", 500, 30);
        Ticket ticket4 = new Ticket(4, "SPB", "MSK", 200, 93);
        Ticket ticket5 = new Ticket(5, "SRT", "SPB", 800, 180);
        Ticket ticket6 = new Ticket(6, "SRT", "SPB", 200, 360);
        Ticket ticket7 = new Ticket(7, "MSK", "SRT", 300, 93);
        Ticket ticket8 = new Ticket(8, "SPB", "SRT", 800, 93);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = {};
        Ticket[] actual = manager.searchBy("NVS", "TMN");
        Assertions.assertArrayEquals(expected, actual);

    }


}
