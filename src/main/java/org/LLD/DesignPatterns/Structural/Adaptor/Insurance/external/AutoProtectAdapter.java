package org.LLD.DesignPatterns.Structural.Adaptor.Insurance.external;

import org.LLD.DesignPatterns.Structural.Adaptor.Insurance.TravelInsuranceAdapter;

public class AutoProtectAdapter implements TravelInsuranceAdapter {

    private AutoProtectApi autoProtectApi = new AutoProtectApi();

    @Override
    public void submitClaim(String claimId, Double amount) {
        autoProtectApi.addClaim(amount);
    }

    @Override
    public String getClaimStatus(String claimId) {
        return autoProtectApi.getStatus(claimId).name();
    }
}
