class Car extends GasVehicle {
    public Car(String plate, String brand) { super(plate, brand); }
    
    @Override
    protected String getType() { return "Ô tô"; }
}