public abstract class Device {
    protected String id;
    protected String name;
    protected boolean state;

    public Device(String id, String name, boolean state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }     
    public void turn() {
        this.state = !this.state;
        if(state) System.out.println(name + " turn on");
        else System.out.println(name + " turn off");
    }
}
