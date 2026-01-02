interface Playable {
    void play();
    void stop();
}

class MusicPlayer implements Playable {
    String song;
    
    public void play() {
        System.out.println("Playing: " + song);
    }
    
    public void stop() {
        System.out.println("Stopped: " + song);
    }
}

class VideoPlayer implements Playable {
    String video;
    
    public void play() {
        System.out.println("Playing video: " + video);
    }
    
    public void stop() {
        System.out.println("Stopped video: " + video);
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.song = "Imagine";
        mp.play();
        mp.stop();
        
        VideoPlayer vp = new VideoPlayer();
        vp.video = "Tutorial.mp4";
        vp.play();
        vp.stop();
    }
}
