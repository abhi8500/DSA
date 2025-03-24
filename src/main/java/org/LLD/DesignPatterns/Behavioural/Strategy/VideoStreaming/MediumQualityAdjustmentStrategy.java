package org.LLD.DesignPatterns.Behavioural.Strategy.VideoStreaming;

public class MediumQualityAdjustmentStrategy implements QualityAdjustmentStrategy{


    @Override
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
}
