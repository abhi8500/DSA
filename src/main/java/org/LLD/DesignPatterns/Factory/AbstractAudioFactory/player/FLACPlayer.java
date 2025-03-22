package org.LLD.DesignPatterns.Factory.AbstractAudioFactory.player;

import org.LLD.DesignPatterns.Factory.AudioFactory.MediaFormat;

public class FLACPlayer extends AudioPlayer{

    public FLACPlayer(int volume,double playbackRate){
        super(volume,playbackRate);
    }

    @Override
    public MediaFormat supportFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public void play() {
        // Simulate playing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Playing FLAC audio");
    }

    @Override
    public void pause() {
        // Simulate pausing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Pausing FLAC audio");
    }

    @Override
    public void stop() {
        // Simulate stopping audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Stopping FLAC audio");
    }

}
