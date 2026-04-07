public class SmartSpeaker extends Device implements Adjustable, WifiConnectable {
    private int volume;
    private boolean wifi_state;
    

    public SmartSpeaker(String id, String name, boolean state, int volume, boolean wifi_state) {
        super(id, name, state);
        this.volume = volume;
        this.wifi_state = wifi_state;
    }

    public void adjust(int volume) {
        if(volume > 0 && volume <= 100) {
            this.volume = volume;
            System.out.println(name + " set volume to " + volume);
            return ;
        } else {
            System.out.println("Error while changing volume");
        }
    }

    public void connectWifi() {
        this.wifi_state = true;
        System.out.println(name + " connected to wifi");
    }
}
