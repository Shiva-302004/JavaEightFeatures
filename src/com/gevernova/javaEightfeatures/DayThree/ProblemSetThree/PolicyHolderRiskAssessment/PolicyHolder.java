package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.PolicyHolderRiskAssessment;

public class PolicyHolder {
    int holderId;
    String name;
    int age;
    String policyType;
    Double premiumAmount;

    public PolicyHolder(int holderId, String name, int age, String policyType, Double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }

    public int getHolderId() {
        return holderId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPolicyType() {
        return policyType;
    }

    public Double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public String toString() {
        return "PolicyHolder{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", policyType='" + policyType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
