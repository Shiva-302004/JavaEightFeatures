package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.FraudDetection;

import java.time.LocalDate;

public class Transaction {
    int transactionId;
    String policyNumber;
    int amount;
    LocalDate transactionDate;
    boolean isFraudulent;

    public Transaction(int transactionId, String policyNumber, int amount, LocalDate transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", policyNumber=" + policyNumber +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", isFraudulent=" + isFraudulent +
                '}';
    }
}
