// Mark Mitri
// CSE 002
// 04/01/2020
// Lab 08

import java.util.Scanner;

public class StringOfNums{
    public static void main(String[] args){
        // Block of code that neatly prints the information given
        // by the methods.
        // All the calling of the methods take in the users input.
        // Dummy variables to assign the return of the methods for printing.
        System.out.println("Enter a three digit number: ");
        String string1 = input();
        System.out.println("You entered: " + string1);
        int string2 = stringToInt(string1);
        System.out.println(string1 + " as a number is: " + string2);
        boolean reverse = isPalindrome(string1);
        System.out.println("Your input of " + string1 + " is a palindrome: " + reverse);
        boolean primeNum = isPrime(string1);
        System.out.println("Your input of " + string1 + " is prime: " + primeNum);
        String evenOdd = parity(string1);
        System.out.println("The parity of the input is: " + evenOdd);
    }

    // Method for checking input for string.
    // Has no parameter because we are using the return
    // in the other methods.
    // Returns a string of the users input.
    public static String input(){
        Scanner keyboard = new Scanner(System.in);
        String keyboardString = " ";
        while(true){
                if(keyboard.hasNextLine()){
                    keyboardString = keyboard.nextLine(); 
                    keyboard.close();
                if(keyboardString.length() > 3){
                    System.out.println("Too long of an input.");
                    System.out.println("Enter three numbers.");
                }else if(keyboardString.length() < 3){
                    System.out.println("Too short of an input.");
                    System.out.println("Enter three numbers.");
                }else{
                    break;
                }
            }else{
                // String junkChar = keyboard.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a letter.");
            }
        }
        return keyboardString;
    }

    // Method for converting a string to an integer.
    // Takes in the users input as a parameter
    // and uses the Integer class and parseInt method
    // to convert to an integer.
    // https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
    // Returns an integer.
    public static int stringToInt(String string1){
        return Integer.parseInt(string1);
    }

    // Method for checking if the input is a palindrome (same first and last character)
    // Takes in the users input as a parameter
    // and uses the built in charAt method.
    // Returns a boolean true or false.
    public static boolean isPalindrome(String string1){
        if(string1.charAt(0) == string1.charAt(2)){
            return true;
        }else{
            return false;
        }
    }

    // Method for checking if the input is a prime number.
    // Takes in users input as a parameter
    // and uses a for loop to check the remainder of the input.
    // Returns a boolean true or false.
    public static boolean isPrime(String string1){
        int replaceString = stringToInt(string1);
        for(int i=2;i<replaceString/2;i++){
            if(replaceString%i==0){
                return false;
            }
        }
        return true;
    }

    // Method for checking the evenness or oddness of the input.
    // Takes in the users input as a parameter
    // and checks the remainder to see if it is an odd or even number.
    // Returns a string.
    public static String parity(String string1){
        int replaceString = stringToInt(string1);
        if(replaceString%2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
}