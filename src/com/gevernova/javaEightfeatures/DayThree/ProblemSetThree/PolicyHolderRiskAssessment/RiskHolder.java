package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.PolicyHolderRiskAssessment;

public class RiskHolder {
    int holderId;
    String name;
    double score;

    public RiskHolder(int holderId, String name, double score) {
        this.holderId = holderId;
        this.name = name;
        this.score = score;
    }

    public int getHolderId() {
        return holderId;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "RiskHolder{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
