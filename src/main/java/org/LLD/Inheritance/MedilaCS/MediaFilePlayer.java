package org.LLD.Inheritance.MedilaCS;

public class MediaFilePlayer {

    public static void playMedia(MediaFile mediaFile) {
        System.out.println(mediaFile.getDetails());
        mediaFile.play();
    }


    public static void main(String[] args) {
        MediaFile audioFile = new AudioFile("Song Title", "Sonu Nigam", "audio.mp3");
        MediaFile videoFile = new VideoFile("Video Title", "video.mp4","30");

        playMedia(audioFile);
        playMedia(videoFile);
    }
}
