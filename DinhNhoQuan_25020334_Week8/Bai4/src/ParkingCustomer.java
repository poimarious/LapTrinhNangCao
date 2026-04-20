import java.util.ArrayList;
import java.util.List;

class ParkingCustomer {
    private final String name;
    private final List<ParkingTicket> tickets = new ArrayList<>();

    public ParkingCustomer(String name) {
        this.name = name;
    }
    
    public void addTicket(ParkingTicket ticket) {
        tickets.add(ticket);
    }

    private double getTotalFee() {
        double total = 0;
        for (ParkingTicket each : tickets) {
            total += each.getFee();
        }
        return total;
    }

    private int getTotalBonusPoint() {
        int total = 0;
        for(ParkingTicket each : tickets) {
            total += each.getBonusPoints();
        }
        return total;
    }

    public String receipt() {
        StringBuilder result = new StringBuilder("Parking Receipt for " + name + "\n");
        for(ParkingTicket each : tickets) {
            result.append(each.getLineItem());
        }
        result.append("Total fee is ").append(getTotalFee()).append("\n");
        result.append("You earned ").append(getTotalBonusPoint()).append(" bonus points\n");
        return result.toString();
    }
}
