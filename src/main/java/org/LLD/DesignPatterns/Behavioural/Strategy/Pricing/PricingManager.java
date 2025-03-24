package org.LLD.DesignPatterns.Behavioural.Strategy.Pricing;

public class PricingManager {

    private PricingType pricingType;
    private PricingStrategy pricingStrategy;

    public PricingManager(PricingType pricingType,PricingStrategy pricingStrategy) {
        this.pricingType = pricingType;
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
       return  pricingStrategy.calculatePrice(rideDetails);
    }
}
