public class Main {
    public static void main(String[] args) {
        
        ParkingCustomer customer = new ParkingCustomer("Anh A");
        
        customer.addTicket(new ParkingTicket(new Car("30A-12345"), 4));   // Fee: 10 + 2*3 = 16
        customer.addTicket(new ParkingTicket(new Bike("29B-55555"), 5));  // Fee: 5 + 2*2 = 9
        customer.addTicket(new ParkingTicket(new Truck("15C-99999"), 6)); // Fee: 15 + 6*4 = 39, Points: 2

        System.out.println(customer.receipt());
    }
}