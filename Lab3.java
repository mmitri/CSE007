// Mark Mitri
// CSE 002
// 2/5/2020
// Lab 3

import java.util.Scanner;

public class Lab3{
    public static void main(String args[]){
        // Declaring integer variables
        double height;
        double weight;

        // Declaring true/false variables
        boolean underweight;
        boolean normal;
        boolean overweight;
        boolean obeaseOne;
        boolean obeaseTwo;

        // Inputs from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in inches: ");
        height = input.nextInt();
        System.out.println("Enter your weight in pounds: ");
        weight = input.nextInt();
        input.close();

        // Mathmatical Operations
        double heightMeters = (height / 39.37);
        double weightKilo = (weight / 2.205);
        double bmi = weightKilo / (heightMeters * heightMeters);
        System.out.println("Your BMI is: " + bmi);

        // If statements regarding BMI groups
        if(bmi < 18.5){
            underweight = true;
        }
        else{
            underweight = false;
        }

        if(bmi >= 18.5 && bmi < 25){
            normal = true;
        }
        else{
            normal = false;
        }

        if(bmi >= 25 && bmi < 30){
            overweight = true;
        }
        else{
            overweight = false;
        }

        if(bmi >= 30 && bmi < 35){
            obeaseOne = true;
        }
        else{
            obeaseOne = false;
        }

        if(bmi >= 35){
            obeaseTwo = true;
        }
        else{
            obeaseTwo = false;
        }

        // Output Statements
        System.out.println("Underweight: " + underweight);
        System.out.println("Normal: " + normal);
        System.out.println("Overweight: " + overweight);
        System.out.println("Obease I: " + obeaseOne);
        System.out.println("Obease II+: " + obeaseTwo);
    }
}