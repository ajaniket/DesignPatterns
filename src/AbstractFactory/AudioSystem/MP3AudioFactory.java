package AbstractFactory.AudioSystem;

import AbstractFactory.AudioSystem.Decoder.AudioDecoder;
import AbstractFactory.AudioSystem.Decoder.MP3Decoder;
import AbstractFactory.AudioSystem.Player.AudioPlayer;
import AbstractFactory.AudioSystem.Player.MP3Player;
import AbstractFactory.AudioSystem.Processor.AudioProcessor;
import AbstractFactory.AudioSystem.Processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory{
    @Override
    public AudioPlayer generatePlayer(int volume, double playBackRate) {
        return new MP3Player(volume, playBackRate);
    }

    @Override
    public AudioDecoder generateDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioProcessor generateProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }
}
