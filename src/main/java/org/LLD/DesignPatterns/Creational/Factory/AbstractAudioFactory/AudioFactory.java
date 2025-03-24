package org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory;

import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.decoder.AudioDecoder;
import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.player.AudioPlayer;
import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.processor.AudioProcessor;

public abstract class AudioFactory {

    public abstract  MediaFormat supportsFormat();
    public abstract AudioDecoder createAudioDecoder(byte[] audioData);
    public abstract AudioProcessor createAudioProcessor(byte[] audioData);
    public abstract AudioPlayer createAudioPlayer(int volume,double playbackRate);
}
