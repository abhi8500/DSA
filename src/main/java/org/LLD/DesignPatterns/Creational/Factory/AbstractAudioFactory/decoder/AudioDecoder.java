package org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.decoder;

import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.MediaFormat;

public abstract class AudioDecoder {

    private final byte[] audioData;

    public AudioDecoder(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] decode();
}
