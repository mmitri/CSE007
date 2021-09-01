// Mark Mitri
// CSE 002
// Exam 002
// 03/22/2020

import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {

      // Scanner <:)
      Scanner scnr = new Scanner(System.in);

      // Declaring my variables.
      boolean arrowheadCheck = false;
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      // User input for arrow base height.
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      // User input for arrow base width.
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      // User input for arrowhead width.
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      System.out.print("");

      // While loop to check if arrowhead width
      // is smaller than the arrowhead base.
      while(!arrowheadCheck){
         if(arrowHeadWidth <= arrowBaseWidth){
            System.out.println("The arrowhead width is smaller than the base.");
            System.out.println("Enter a larger arrow head width: ");
            arrowHeadWidth = scnr.nextInt();
         } else {
            arrowheadCheck = true;
         }
      }
      
      // For loop for the arrow base and height
      // notice that the outside loop ends when
      // i is less than arrowBaseHeight
      // and the inside loop ends when
      // j is less than arrowBaseWidth.
      for (int i = 0; i < arrowBaseHeight; ++i){
         for (int j = 0; j < arrowBaseWidth; j++){
            System.out.print("*");
         }
         System.out.println(" ");
      }

      // for loop for arrowhead
      for (int w = arrowHeadWidth; w > 0 ; w--) {
         for(int g = 0; g < w; g++){
            System.out.print("*");
         }
        System.out.println();
      }

      // Example of output: 

      // Draw arrow base (height = 3, width = 2)
      // System.out.println("**");
      // System.out.println("**");
      // System.out.println("**");
      // Draw arrow head (width = 4)
      // System.out.println("****");
      // System.out.println("***");
      // System.out.println("**");
      // System.out.println("*");


      // Always close your scanners <:)
      scnr.close();
   }
}