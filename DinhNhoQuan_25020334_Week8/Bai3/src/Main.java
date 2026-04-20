public class Main {
    public static void main(String[] args) {
        
        Vehicle motorbike = new MotorBike("29-A1 12345", "Honda");
        Vehicle car = new Car("30-H 6789", "Toyota");
        Vehicle eCar = new ElectricCar("30-E 5555", "VinFast");

        System.out.println(motorbike.getInfo());
        System.out.println(car.getInfo());
        System.out.println(eCar.getInfo());
    }
}