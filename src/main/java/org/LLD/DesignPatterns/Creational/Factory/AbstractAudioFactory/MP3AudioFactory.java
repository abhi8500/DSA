package org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory;

import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.decoder.AudioDecoder;
import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.decoder.MP3Decoder;
import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.player.AudioPlayer;
import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.player.MP3Player;
import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.processor.AudioProcessor;
import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory{


    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume,playbackRate);
    }
}
