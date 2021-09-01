// Mark Mitri
// CSE 002
// Lab 2
// 1/29/2020

public class MPG{
    // Main method required for every Java program
    public static void main(String[] args){
        // Document your variables by placing
        // Comments after the "//". State the purpose of each variable.
        double gasTrip1 = 8.2; // Amount of gas for trip 1
        double gasTrip2 = 13.7; // Amount of gas for trip 2
        double milesTrip1 = 178; // Distance for trip 1
        double milesTrip2 = 342; // Distace for trip 2

        // Variables for the miles-per-galon per 
        // each trip and the total
        double mpg1, mpg2, mpgTotal;

        // Prints out in sentences the miles traveled and the 
        // amount of gas per trip
        System.out.println("Trip 1 covered "+milesTrip1+" miles");
        System.out.println("Trip 2 covered "+milesTrip2+" miles");
        System.out.println("Trip 1 used "+gasTrip1+" gallons of gas");
        System.out.println("Trip 2 used "+gasTrip2+" gallons of gas");

        // Compute the values for miles-per-gallon
        mpg1 = milesTrip1/gasTrip1;
        mpg2 = milesTrip2/gasTrip2;
        mpgTotal = (milesTrip1+milesTrip2) / (gasTrip1+gasTrip2);

        // Prints out the output data
        System.out.println("The miles per gallon for trip 1 was "+mpg1);
        System.out.println("The miles per gallon for trip 2 was "+mpg2);
        System.out.println("The miles per gallon for the combined trips was "+mpgTotal);
    }   // End of main method
}   // End of class