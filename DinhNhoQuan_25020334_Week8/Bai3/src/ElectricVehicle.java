abstract class ElectricVehicle extends Vehicle {
    protected int batteryPercent;

    public ElectricVehicle(String plate, String brand) {
        super(plate, brand);
    }

    public void charge(int percent) {
        this.batteryPercent += percent;
    }
}