package org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.processor;

import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.MediaFormat;

public abstract class AudioProcessor {

    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] process();
}
