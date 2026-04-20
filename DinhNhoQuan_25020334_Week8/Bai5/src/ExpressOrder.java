public class ExpressOrder extends Order {
    private String label;

    public ExpressOrder(double weight, double distance) {
        super(weight, distance);
        this.label = "[Hỏa tốc]";
    }

    @Override
    public double getDeliveryFee() {
        return (weight * 3000 + distance * 500) * 1.5;
    }

    @Override
    public String getLabel(){
        return label;
    }
}
