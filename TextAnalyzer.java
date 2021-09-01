// Mark Mitri
// CSE 002
// Exam 002
// 03/22/2020

import java.util.Scanner;

public class TextAnalyzer {
  
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    // Initializing my variables
    boolean loopExit = false; 
    String userString = "VOID STRING";
    int lengthString = -1;
    String stringWhitespace = "VOID STRING";
    String exit = "VOID STRING";
    int numChars = 0; 

    // while loop that exits with a boolean
    while(!loopExit){ // WARNING: This is currently an infinite loop! // <--- Fixed
      System.out.println("Enter a sentence or phrase:");
      // Asks for user input
      userString = scnr.nextLine();
      System.out.println("You entered: " + userString);
   
			// Explicitly count the number of characters using a for loop
      // and then compare with .length()
      // for loop starts at the end of the string (i = 0)
      // stops when it reaches the end (i < userString.length())
      // if statement checking for characters that are a space or that isn't a space
      for(int i = 0; i < userString.length(); i++) {    
        if(userString.charAt(i) == ' ' || userString.charAt(i) != ' '){
          numChars++;    
        }
      }    
      System.out.println("Number of characters: " + numChars);
      lengthString = userString.length();
      System.out.println("Length of string: " + lengthString);
      
      // Print the user's string without whitespaces
      // .replaceAll replaces specific characters in a string
      // \s removes all characters that are a space
      stringWhitespace = userString.replaceAll("\\s","");
      System.out.println("String with no whitespace: " + stringWhitespace);

      // Prompt the user to continue, or not:
      System.out.println("Type 'exit' if you do not wish to continue (and anything else, if you wish to continue): ");
      exit = scnr.nextLine();
      if(exit.equals("exit")){
        loopExit = true;
        numChars = 0;
      } else {
        loopExit = false;
        numChars = 0;
      }
      // resetting the numChars at the end of the loop
    } 
    scnr.close();
  }
}

