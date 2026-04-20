public class BulkyOrder extends Order {
    private String label;

    public BulkyOrder(double weight, double distance) {
        super(weight, distance);
        this.label = "[Hàng cồng kềnh]";
    }

    @Override
    public double getDeliveryFee(){
        return weight * 4000 + distance * 600 + 50000;
    }

    @Override
    public String getLabel(){ 
        return label;
    }
}
