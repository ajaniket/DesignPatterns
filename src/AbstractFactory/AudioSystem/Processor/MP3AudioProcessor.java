package AbstractFactory.AudioSystem.Processor;

import AbstractFactory.AudioSystem.MediaFormat;

public class MP3AudioProcessor extends AudioProcessor {

    public MP3AudioProcessor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public byte[] process() {
        // Implement MP3 audio processing logic
        System.out.println("Processing MP3 audio data...");
        // Processing process
        return getAudioData();
    }
}
