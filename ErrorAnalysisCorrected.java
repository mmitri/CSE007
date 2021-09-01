// Mark Mitri
// CSE 002
// Exam 002
// 03/22/2020

import java.util.Scanner;

public class ErrorAnalysisCorrected{
  public static void main(String[] args){
	  Scanner myScanner = new Scanner(System.in);
    int j;
    boolean integerCheck = false;
    boolean zeroCheck = false;
    // Print all numbers between 0 and 100, inclusive,
	  myScanner.close();// that are divisible by 5
    for(j = 0; j <= 100; j++){
      if (j % 5 == 0){
        System.out.println("Divisible by 5: " + j);
      }else{
		    System.out.println("Not divisible by 5: " + j); 
        continue;
	    }
    }
    //Compute the first nonzero number divisible by 7 between 0 and 100.
    while(!zeroCheck){
      for(int m = 1; m < 100; m++){
        if(m % 7 == 0){
          System.out.println("First nonzero number divisible by 7: " + m); 
          break;
        }
      }
      zeroCheck = true;
    }
		// Take user input and print it to the console
		System.out.println("Input an integer of any value: ");
    while(!integerCheck){
      int input = myScanner.nextInt();
      System.out.println("Your input is: " + input);
      integerCheck = true;
      myScanner.close();
    }
    
  }
}
