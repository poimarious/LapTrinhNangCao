public class PlayerAdapter implements Player {
    
    private OldPlayer oldPlayer;

    public PlayerAdapter(OldPlayer o) {
        this.oldPlayer = o;
    }

    @Override
    public void play(String name) {
        oldPlayer.playFile(name);
    }
    
}
