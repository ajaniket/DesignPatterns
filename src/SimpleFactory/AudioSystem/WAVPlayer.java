package SimpleFactory.AudioSystem;

public class WAVPlayer extends AudioPlayer{

    public WAVPlayer(int volume, double playBackRate) {
        super(volume,playBackRate);
    }

    public void play() {
        // Simulate playing audio in WAV format
        // Each media format will have its own implementation
        System.out.println("Playing WAV audio");
    }

    public void pause() {
        // Simulate pausing audio in WAV format
        // Each media format will have its own implementation
        System.out.println("Pausing WAV audio");
    }

    public void stop() {
        // Simulate stopping audio in WAV format
        // Each media format will have its own implementation
        System.out.println("Stopping WAV audio");
    }


    @Override
    public MediaFormat supportsType() {
        return MediaFormat.WAV;
    }
}
