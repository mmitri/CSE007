// Mark Mitri
// CSE 002
// 04/19/2020
// Exam 03

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        // Declaring my variables
        Scanner keyboard = new Scanner(System.in);
        int currNum, listLength;
        boolean rightInput = false;

        System.out.println("Enter the size of the array: ");
        
        // While loop to check for right input
        while(!rightInput){
            if(keyboard.hasNextInt()){
                listLength = keyboard.nextInt();
                if(listLength <= 0){
                    System.out.println("Size must be a positive integer.");
                    System.out.println("Enter a positive integer greater than 0: ");
                }else{
                    int[] listNums = new int[listLength];
                    // For loop to initialize the array with input
                    for(int i = 0; i<listLength;i++){
                        System.out.println("Enter the value for " + i + ":");
                        currNum = keyboard.nextInt();
                        listNums[i] = currNum;
                    }
                    reverseArray(listNums);
                    System.out.println(Arrays.toString(listNums));
                    rightInput = true;
                }
            }else{
                System.out.println("Not the right type of input.");
                System.out.println("Enter an integer: ");
            }
        }
        keyboard.close();
    }

    // Method for switching the order of the array
    // Parameter include the array, but returns void.
    // The use of a temp variable is helpful to "hold"
    // an integer
    public static void reverseArray(int[] listNums){
        int j = listNums.length - 1;
        for(int i = 0; i< listNums.length / 2; i++, j--){
            int temp = listNums[i];
            listNums[i] = listNums[j];
            listNums[j] = temp;
        }
    }
}