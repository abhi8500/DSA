package org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.decoder;

import org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.MediaFormat;

public class FLACDecoder extends AudioDecoder{

    public FLACDecoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] decode() {
        // Implement FLAC decoding logic
        System.out.println("Decoding FLAC audio data...");
        // Decoding process
        return getAudioData();
    }
}
