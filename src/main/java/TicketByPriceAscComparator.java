import java.util.Comparator;

public class TicketByPriceAscComparator implements Comparator<Ticket> {
    public int compare(Ticket o1, Ticket o2) {
        return o2.getPrice() - o1.getPrice();
    }
}