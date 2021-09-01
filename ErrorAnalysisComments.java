// Mark Mitri
// CSE 002
// Exam 002
// 03/22/2020

// Compiler error: Forgot import java.util.Scanner;

public class ErrorAnalysisComments{
  public static void main(String[] args){
		// Scanner myScanner = new Scanner(System.in);
    int j = 0;
    // Print all numbers between 0 and 100, inclusive,
    // that are divisible by 5
    
    // Runtime error: infite while loop
    // I would change it to a for loop
    while(j < 100){ // Logic error: This does not include 100. Has to be <=
      if (j % 5 == 0){
        System.out.println("Divisible by 5: " + j);
      }
			else{
				continue; // Logic error: continue; has to be after the printline. It currently just skips over it
      	// System.out.println("Not divisible by 5: " + j); 
			}
    }
    //Compute the first nonzero number divisible by 7 between 0 and 100.
    while(true){ // Runtime error: while loop will never end. I change this to a boolean statement
      // Logic error: for loop wil always end at 0 because 0 is divisible by 7
      // Changed this to: int m = 1
      for(int m = 0; m < 10; m++){ // Logic error: for loop only computes numbers up to 10
        if(m % 7 == 0){
          // Logic error: no print statement?
          break;
        }
      }
    }
		// Take user input and print it to the console
		// System.out.println("Input an integer of any value: ");
	//while(true){ // Runtime error: while loop will never end. I change this to a boolean statement
      // String input = myScanner.nextInt(); // Runtime error: String variable, but integer input.
    }

    // Compiler error: the variable input is out-of-scope of where it is declared
    // Placed print statement in while loop
    // System.out.println("Your input is: " + input);
    
    // Never closes scanner
{
}
}
