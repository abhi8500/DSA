package org.LLD.DesignPatterns.Behavioural.Strategy.VideoStreaming;

public interface QualityAdjustmentStrategy {

    VideoQuality supportsType();
    Video adjust(Video video);
}
