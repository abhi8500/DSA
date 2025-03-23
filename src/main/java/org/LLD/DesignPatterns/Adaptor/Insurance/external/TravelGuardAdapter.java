package org.LLD.DesignPatterns.Adaptor.Insurance.external;

import org.LLD.DesignPatterns.Adaptor.Insurance.TravelInsuranceAdapter;

public class TravelGuardAdapter implements TravelInsuranceAdapter {

    TravelGuardApi travelGuardApi  = new TravelGuardApi();

    @Override
    public void submitClaim(String claimId, Double amount) {
        travelGuardApi.submitClaim(claimId,amount);
    }

    @Override
    public String getClaimStatus(String claimId) {
        return travelGuardApi.getClaimStatus(claimId);
    }
}
