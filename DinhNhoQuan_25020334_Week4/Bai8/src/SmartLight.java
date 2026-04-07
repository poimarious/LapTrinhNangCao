public class SmartLight extends Device implements Adjustable {
    private int brightness;

    public SmartLight(String id, String name, boolean state, int brightness) {
        super(id, name, state);
        this.brightness = brightness;  
    }

    public void adjust(int brightness) {
        if(brightness >= 0 && brightness <= 100) {
            this.brightness = brightness; 
            System.out.println(name + " set brightness to " + brightness);
            return ;
        }
        System.out.println("Error while changing brightness!");
    }
}
