package AbstractFactory.AudioSystem;

import AbstractFactory.AudioSystem.Decoder.AudioDecoder;
import AbstractFactory.AudioSystem.Decoder.FLACDecoder;
import AbstractFactory.AudioSystem.Player.AudioPlayer;
import AbstractFactory.AudioSystem.Player.FLACPlayer;
import AbstractFactory.AudioSystem.Processor.AudioProcessor;
import AbstractFactory.AudioSystem.Processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory{

    @Override
    public AudioPlayer generatePlayer(int volume, double playBackRate) {
        return new FLACPlayer(volume,playBackRate);
    }

    @Override
    public AudioDecoder generateDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioProcessor generateProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
}
