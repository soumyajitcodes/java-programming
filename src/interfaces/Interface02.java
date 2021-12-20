package interfaces;

class Phone {
    void call() {
        System.out.println("Phone call");
    }
    void sms() {
        System.out.println("Phone sms");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    void VideoCall() {
        System.out.println("Video Call Started");
    }
    public void click() {
        System.out.println("Click Pictures");
    }

    public void record() {
        System.out.println("Record Video");
    }

    public void play() {
        System.out.println("Play Music");
    }

    public void pause() {
        System.out.println("Pause Music");
    }

    public void stop() {
        System.out.println("Stop Playing Music");
    }
}

public class Interface02 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
        s.VideoCall();
    }
}
