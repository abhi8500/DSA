package org.LLD.DesignPatterns.Factory.AbstractAudioFactory;

import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.decoder.AudioDecoder;
import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.decoder.FLACDecoder;
import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.player.AudioPlayer;
import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.player.FLACPlayer;
import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.processor.AudioProcessor;
import org.LLD.DesignPatterns.Factory.AbstractAudioFactory.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory{


    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume,playbackRate);
    }
}
