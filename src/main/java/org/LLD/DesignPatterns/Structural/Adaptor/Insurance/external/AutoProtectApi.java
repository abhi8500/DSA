package org.LLD.DesignPatterns.Structural.Adaptor.Insurance.external;

import org.LLD.DesignPatterns.Structural.Adaptor.Insurance.ApiUtils;

public class AutoProtectApi {

    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}
