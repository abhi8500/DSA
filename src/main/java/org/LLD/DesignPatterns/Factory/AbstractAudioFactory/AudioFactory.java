package org.LLD.DesignPatterns.Factory.AbstractAudioFactory;

import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.decoder.AudioDecoder;
import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.player.AudioPlayer;
import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.processor.AudioProcessor;

public abstract class AudioFactory {

    public abstract  MediaFormat supportsFormat();
    public abstract AudioDecoder createAudioDecoder(byte[] audioData);
    public abstract AudioProcessor createAudioProcessor(byte[] audioData);
    public abstract AudioPlayer createAudioPlayer(int volume,double playbackRate);
}
