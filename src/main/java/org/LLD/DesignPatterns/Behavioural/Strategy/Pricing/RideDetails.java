package org.LLD.DesignPatterns.Behavioural.Strategy.Pricing;

public class RideDetails {

    private double distance; // Distance in kilometers
    private int duration; // Duration in minutes

    public RideDetails(double distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
