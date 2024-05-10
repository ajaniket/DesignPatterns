package AbstractFactory.AudioSystem;

import AbstractFactory.AudioSystem.Decoder.AudioDecoder;
import AbstractFactory.AudioSystem.Player.AudioPlayer;
import AbstractFactory.AudioSystem.Processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract AudioPlayer generatePlayer(int volume, double playBackRate);
    public abstract AudioDecoder generateDecoder(byte[] audioData);
    public abstract AudioProcessor generateProcessor(byte[] audioData);
    public abstract MediaFormat supportsFormat();
}
