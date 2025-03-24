package org.LLD.DesignPatterns.Structural.Adaptor.Insurance.external;

import org.LLD.DesignPatterns.Structural.Adaptor.Insurance.ApiUtils;

public class TravelGuardApi {

    public void submitClaim(String id, Double amount) {
        ApiUtils.logTravelGuardClaimCall();
    }

    public String getClaimStatus(String id) {
        ApiUtils.logTravelGuardStatusCall();
        return "SUCCESS";
    }
}
