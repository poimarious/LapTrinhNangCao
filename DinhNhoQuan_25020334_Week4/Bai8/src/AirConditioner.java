public class AirConditioner extends Device implements WifiConnectable {
    private boolean wifi_state;

    public AirConditioner(String id, String name, boolean state, boolean wifi_state) {
        super(id, name, state);
        this.wifi_state = wifi_state;
    }

    public void connectWifi() {
        this.wifi_state = true;
        System.out.println(name + " connected to wifi");
    }
}
