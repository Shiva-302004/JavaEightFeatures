package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.ClaimAnalysis;

import java.time.LocalDate;

public class Claim {
    int claimId;
    int policyNumber;
    int getClaimAmount;
    String claimDate;
    String status;

    public Claim(int claimId, int policyNumber, int getClaimAmount, String claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.getClaimAmount = getClaimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getGetClaimAmount() {
        return getClaimAmount;
    }

    public void setGetClaimAmount(int getClaimAmount) {
        this.getClaimAmount = getClaimAmount;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", policyNumber=" + policyNumber +
                ", getClaimAmount=" + getClaimAmount +
                ", claimDate='" + claimDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
