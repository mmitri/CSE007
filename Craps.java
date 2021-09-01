// Mark Mitri
// CSE 002
// 2/12/2020
// Homework 4

import java.util.Scanner;

public class Craps{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        // Declaring the random numbers from 1-6 (inclusive)
        // for both die
        int crapsNum1 = (int)(Math.random() * (7-0) + 1);
        int crapsNum2 = (int)(Math.random() * (7-0) + 1);

        // Declaring the name of the roll
        String crapsName = "";
        System.out.print("Do you want to randomly roll the dice? (1=Y/2=N): ");
        int castDice = input.nextInt();

        // Switch case that handles the choice of rolling or picking the numbers for the dice
        // If statements in both cases handles if the roll is 1 for the first dice and 1 for the second
        // but also if 1 is the second and 1 is the first, for example
        switch(castDice){

            // First case (random roll)
            case 1: if(crapsNum1 == 1 && crapsNum2 == 1 || crapsNum2 == 1 && crapsNum1 == 1){
                        crapsName = "Snake Eyes";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 1 && crapsNum2 == 2 || crapsNum2 == 1 && crapsNum1 == 2){
                        crapsName = "Ace Deuce";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 1 && crapsNum2 == 3 || crapsNum2 == 1 && crapsNum2 == 3){
                        crapsName = "Easy Four";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 1 && crapsNum2 == 4 || crapsNum2 == 1 && crapsNum1 == 1){
                        crapsName = "Fever Five";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 1 && crapsNum2 == 5 || crapsNum2 == 1 && crapsNum1 == 5){
                        crapsName = "Easy Six";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 1 && crapsNum2 == 6 || crapsNum2 == 1 && crapsNum1 == 6){
                        crapsName = "Seven Out";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 2 && crapsNum2 == 2 || crapsNum2 == 2 && crapsNum1 == 2){
                        crapsName = "Hard Four";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 2 && crapsNum2 == 3 || crapsNum2 == 2 && crapsNum1 == 3){
                        crapsName = "Fever Five";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 2 && crapsNum2 == 4 || crapsNum2 == 2 && crapsNum1 == 4){
                        crapsName = "Easy Six";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 2 && crapsNum2 == 5 || crapsNum2 == 2 && crapsNum1 == 5){
                        crapsName = "Seven Out";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 2 && crapsNum2 == 6 || crapsNum2 == 2 && crapsNum1 == 6){
                        crapsName = "Easy Eight";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 3 && crapsNum2 == 3 || crapsNum2 == 3 && crapsNum1 == 3){
                        crapsName = "Hard Six";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 3 && crapsNum2 == 4 || crapsNum2 == 3 && crapsNum1 == 4){
                        crapsName = "Seven Out";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 3 && crapsNum2 == 5 || crapsNum2 == 3 && crapsNum1 == 5){
                        crapsName = "Easy Eight";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 3 && crapsNum2 == 6 || crapsNum2 == 3 && crapsNum1 == 6){
                        crapsName = "Nine";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 4 && crapsNum2 == 4 || crapsNum2 == 4 && crapsNum1 == 4){
                        crapsName = "Hard Eight";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 4 && crapsNum2 == 5 || crapsNum2 == 4 && crapsNum1 == 5){
                        crapsName = "Nine";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 4 && crapsNum2 == 6 || crapsNum2 == 4 && crapsNum1 == 6){
                        crapsName = "Easy Ten";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 5 && crapsNum2 == 5 || crapsNum2 == 5 && crapsNum1 == 5){
                        crapsName = "Hard Ten";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else if(crapsNum1 == 5 && crapsNum2 == 6 || crapsNum2 == 5 && crapsNum1 == 6){
                        crapsName = "Yo-leven";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
                    else{
                        crapsName = "Boxcards";
                        System.out.println("You roled: " + crapsNum1 + " & " + crapsNum2);
                        System.out.println(crapsName);
                    }
            break;

            // Second case (choose the value for the dice)
            case 2: System.out.println("Input your first value of dice(1-6): ");
                    int userDice1 = input.nextInt();
                    System.out.println("Input your second value of dice(1-6): ");
                    int userDice2 = input.nextInt();
                    if(userDice1 == 1 && userDice2 == 1 || userDice2 == 1 && userDice1 == 1){
                        crapsName = "Snake Eyes";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 1 && userDice2 == 2 || userDice2 == 1 && userDice1 == 2){
                        crapsName = "Ace Deuce";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 1 && userDice2 == 3 || userDice2 == 1 && userDice1 == 3){
                        crapsName = "Easy Four";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 1 && userDice2 == 4 || userDice2 == 1 && userDice1 == 1){
                        crapsName = "Fever Five";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 1 && userDice2 == 5 || userDice2 == 1 && userDice1 == 5){
                        crapsName = "Easy Six";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 1 && userDice2 == 6 || userDice2 == 1 && userDice1 == 6){
                        crapsName = "Seven Out";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 2 && userDice2 == 2 || userDice2 == 2 && userDice1 == 2){
                        crapsName = "Hard Four";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 2 && userDice2 == 3 || userDice2 == 2 && userDice1 == 3){
                        crapsName = "Fever Five";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 2 && userDice2 == 4 || userDice2 == 2 && userDice1 == 4){
                        crapsName = "Easy Six";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 2 && userDice2 == 5 || userDice2 == 2 && userDice1 == 5){
                        crapsName = "Seven Out";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 2 && userDice2 == 6 || userDice2 == 2 && userDice1 == 6){
                        crapsName = "Easy Eight";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 3 && userDice2 == 3 || userDice2 == 3 && userDice1 == 3){
                        crapsName = "Hard Six";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 3 && userDice2 == 4 || userDice2 == 3 && userDice1 == 4){
                        crapsName = "Seven Out";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                       
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 3 && userDice2 == 5 || userDice2 == 3 && userDice1 == 5){
                        crapsName = "Easy Eight";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 3 && userDice2 == 6 || userDice2 == 3 && userDice1 == 6){
                        crapsName = "Nine";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                       
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 4 && userDice2 == 4 || userDice2 == 4 && userDice1 == 4){
                        crapsName = "Hard Eight";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 4 && userDice2 == 5 || userDice2 == 4 && userDice1 == 5){
                        crapsName = "Nine";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);                        
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 4 && userDice2 == 6 || userDice2 == 4 && userDice1 == 6){
                        crapsName = "Easy Ten";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 5 && userDice2 == 5 || userDice2 == 5 && userDice1 == 5){
                        crapsName = "Hard Ten";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);
                        System.out.println(crapsName);
                    }
                    else if(userDice1 == 5 && userDice2 == 6 || userDice2 == 5 && userDice1 == 6){
                        crapsName = "Yo-leven";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);
                        System.out.println(crapsName);
                    }
                    else{
                        crapsName = "Boxcards";
                        System.out.println("You picked " + userDice1 + " & " + userDice2);
                        System.out.println(crapsName);
                    }
            break;
            default: System.out.println("Error");
        }
        input.close();
    }
}