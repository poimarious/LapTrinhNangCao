abstract class Order {
    protected double weight;
    protected double distance;

    public Order(double weight, double distance) {
        this.weight = weight; this.distance = distance;
    }

    abstract double getDeliveryFee();
    abstract String getLabel();
}