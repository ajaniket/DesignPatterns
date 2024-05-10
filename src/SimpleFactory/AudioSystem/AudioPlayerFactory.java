package SimpleFactory.AudioSystem;

public class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(MediaFormat format,int volume, double playBackRate){
        return switch (format){
            case MP3 -> new MP3Player(volume,playBackRate);
            case WAV -> new WAVPlayer(volume, playBackRate);
            case FLAC -> new FLACPlayer(volume, playBackRate);
            default -> throw new IllegalStateException();
        };
    }
}
