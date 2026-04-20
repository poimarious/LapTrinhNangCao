public class FragileOrder extends Order {
    private String label;

    public FragileOrder(double weight, double distance) {
        super(weight, distance);
        this.label = "[Hàng dễ vỡ]";
    }

    @Override
    public double getDeliveryFee() {
        return weight * 5000 + distance * 700 + 20000;
    }

    @Override
    public String getLabel(){ 
        return label;
    }
}
