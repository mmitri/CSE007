// Mark Mitri
// CSE 002
// 02/8/2020
// HW 3

import java.util.Scanner;


public class HW3{
    public static void main(String args[]){

        // Declaring my variables
        double numToilets; // 1 toilet per 3 people
        double toiletWaterUsage = 15.0; // 15 liters per flush
        double lowFlushToilets = 2.0; // Low-flush toilets: 2 liters per flush
        int flushToilets = 14; // 14 flushes per day
        double costToilets;// $100 for new toilet
        double cost37Liters = 0.02; // $0.02: Cost for 37.8541 liters

        // Input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the community's population: ");
        int population = input.nextInt();
        input.close();

        // Calculations
        numToilets = (population / 3);
        costToilets = (numToilets * 100);
        double waterUsedDaily = ((toiletWaterUsage*flushToilets) * numToilets);
        double costPerDay = ((waterUsedDaily / 37.8541) * cost37Liters);
        double waterUsedDailyLow = ((lowFlushToilets*flushToilets) * numToilets);
        double costPerDayLow = ((waterUsedDailyLow / 37.8541) * cost37Liters);
        double waterSaved = (waterUsedDaily - waterUsedDailyLow);
        double yearlyCostWater = (costPerDay * 365);
        double yearlyCostWaterLow = (costPerDayLow * 365);
        double savingCostWater = (yearlyCostWater - yearlyCostWaterLow);

        // Output
        System.out.println("Quantity of water saved: " + waterSaved + " Liters/day.");
        System.out.printf("Cost of installing new toilets: $" + "%2.2f%n", costToilets);
        System.out.printf("Yearly cost of water (before): $" + "%2.2f%n", yearlyCostWater);
        System.out.printf("Yearly cost of water (after): $" + "%2.2f%n", yearlyCostWaterLow);
        System.out.printf("Savings in cost of water (first year): $" + "%2.2f%n", savingCostWater);
        
    }
}