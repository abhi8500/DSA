package org.LLD.DesignPatterns.Behavioural.Strategy.Pricing;

public interface PricingStrategy {

    double BASE_FARE = 5.0; // Base fare amount
    double PER_KILOMETER_RATE = 2.0; // Rate per kilometer
    double PER_MINUTE_RATE = 0.5; // Rate per minute
    double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier


    PricingType supportsType();

    Double calculatePrice(RideDetails rideDetails);
}
