public class DVD extends MediaItem {
    public String director;
    public int duration;

    public DVD(String id, String name, String director, int duration) {
        super(id, name);
        this.director = director;
        this.duration = duration;
    }

    public String getInfo() {
        return name + " - " + director + " - " + duration;
    }

}
