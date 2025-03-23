package org.LLD.DesignPatterns.Adaptor.Insurance;

public interface TravelInsuranceAdapter {

    void submitClaim(String claimId,Double amount);
    String getClaimStatus(String claimId);
}
