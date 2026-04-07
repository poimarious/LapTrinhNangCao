public class Main {
	public static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer();
        VideoPlayer video = new VideoPlayer();

        MediaPlayer media = new MediaPlayer(audio, video);

        media.playAudio("a.mp3");
        media.playVideo("b.mkv");
	}
 }
