// Mark Mitri
// CSE 002
// 2/5/2020
// Lab 3 Warmup

import java.util.Scanner;

public class Lab3Warmup{
    public static void main(String args[]){
 	 int first, second;
 	 Scanner input = new Scanner(System.in);
 	 System.out.print("Enter an integer value: ");
 	 first = input.nextInt();
 	 System.out.print("Enter another integer value: ");
 	 second = input.nextInt();
 	 first++;
 	 first = first % second;
 	 second = second++;
 	 int result =  first / second; 	
 	 System.out.println("result= " + result);
      input.close();
    }
}