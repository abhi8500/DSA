package org.LLD.DesignPatterns.Structural.Adaptor.Insurance;

public interface TravelInsuranceAdapter {

    void submitClaim(String claimId,Double amount);
    String getClaimStatus(String claimId);
}
