package org.LLD.DesignPatterns.Adaptor.Insurance.external;

import org.LLD.DesignPatterns.Adaptor.Insurance.ApiUtils;

public class TravelGuardApi {

    public void submitClaim(String id, Double amount) {
        ApiUtils.logTravelGuardClaimCall();
    }

    public String getClaimStatus(String id) {
        ApiUtils.logTravelGuardStatusCall();
        return "SUCCESS";
    }
}
