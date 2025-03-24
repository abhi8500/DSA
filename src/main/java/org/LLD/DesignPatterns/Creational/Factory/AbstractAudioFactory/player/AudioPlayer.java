package org.LLD.DesignPatterns.Creational.Factory.AbstractAudioFactory.player;

import org.LLD.DesignPatterns.Creational.Factory.AudioFactory.MediaFormat;

public abstract class AudioPlayer {

    private int volume;
    private double playbackRate;

    public AudioPlayer(int volume,double playbackRate){
        this.volume = volume;
        this.playbackRate = playbackRate;
    }

    public abstract  MediaFormat supportFormat();
    public abstract  void play();
    public abstract void pause();
    public abstract void stop();

    public int getVolume() {
        return volume;
    }

    public double getPlaybackRate() {
        return playbackRate;
    }

    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }else {
            System.out.println("Invalid Volume");
        }
    }
}
