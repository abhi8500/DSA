package org.LLD.DesignPatterns.Behavioural.Strategy.Pricing;

public class TimeBasedPricingStrategy implements PricingStrategy{
    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
