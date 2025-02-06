package org.LLD.Inheritance.MedilaCS;

public class AudioFile extends MediaFile{

    private final String artist;

    public AudioFile(String title,String artist,String fileName){
        super(title,fileName);
        this.artist = artist;
    }

    @Override
    public void play(){
        System.out.println("Playing audio file: " + fileName);
    }

    @Override
    public String getDetails(){
        return super.getDetails()+", Artist "+this.artist;
    }
}
