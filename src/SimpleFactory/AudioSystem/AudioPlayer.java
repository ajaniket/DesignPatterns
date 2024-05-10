package SimpleFactory.AudioSystem;

//in base abstract class, we can implement the common members and methods as it can be inherited in the child class
//instead of writing the redundant code again and again;

public abstract class AudioPlayer {
    private int volume;
    private double playBackRate;

    public AudioPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Invalid volume level");
        }
    }
    public double getPlayBackRate() {
        return playBackRate;
    }

    //all abstract methods that are common and mandatory in child class but their implementation is different
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract MediaFormat supportsType();
}
