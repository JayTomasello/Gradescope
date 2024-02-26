package com.gradescope.Program3;

public class Program3 {

    public double calculateCommission(double totalSales) {
        double commissionRate;
        if (totalSales < 200) {
            commissionRate = 0.08; // 8%
        } else if (totalSales < 400) {
            commissionRate = 0.10; // 10%
        } else {
            commissionRate = 0.12; // 12%
        }
        return totalSales * commissionRate;
    }
    
    // Method to calculate total income
    public double calculateIncome(double totalSales) {
        double commission = calculateCommission(totalSales);
        return commission;
    }
}
