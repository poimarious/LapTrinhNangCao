public class MediaPlayer {

    AudioPlayable audio;
    VideoPlayable video;

    public MediaPlayer(AudioPlayable audio, VideoPlayable video) {
        this.audio = audio;
        this.video = video;
    }

    public void playAudio(String file) {
        audio.playAudio(file);
    }

    public void playVideo(String file) {
        video.playVideo(file);
    }
}
