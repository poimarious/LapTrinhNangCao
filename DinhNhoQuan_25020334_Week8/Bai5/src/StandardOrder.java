public class StandardOrder extends Order {
    String label;
    public StandardOrder(double weight, double distance) {
        super(weight, distance);
        this.label = "[Thường]";
    }

    @Override
    public double getDeliveryFee() {
        return weight * 3000 + distance * 500;
    }

    @Override
    public String getLabel() {
        return label;
    }

}
