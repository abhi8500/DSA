package org.LLD.DesignPatterns.Behavioural.Strategy.Pricing;

public class DistanceBasedPricingStrategy implements PricingStrategy{


    @Override
    public PricingType supportsType() {
        return PricingType.DISTANCE_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance();
    }
}
