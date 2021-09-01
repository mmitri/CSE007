// Mark Mitri
// CSE 002
// 3/20/2020
// HW 6

import java.util.Scanner;
public class Checkerboard{
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    // Declare variables
    int height, width, squareSize;

    // While loop for height of the checkerboard
    System.out.println("Enter the height of the checkerboard: ");
    while(true){
        if(keyboard.hasNextInt()){
            height = keyboard.nextInt();
            if(height <= 0){
                System.out.println("Enter a positive integer: ");
            } else {
                break;
            }
            } else {
                // String junk = keyboard.nextLine();
                System.out.println("Enter an number: ");
            }
        }

    // While loop for width of the checkerboard
    System.out.println("Enter the width of the checkerboard: ");
    while(true){
        if(keyboard.hasNextInt()){
            width = keyboard.nextInt();
            if(width <= 0){
                System.out.println("Enter a positive integer: ");
            } else {
                break;
            }
            } else {
                // String junk = keyboard.nextLine();
                System.out.println("Enter an number: ");
            }
        }

    // While loop for the size of the checkerboard
    System.out.println("Enter the size of the checkerboard: ");
    while(true){
        if(keyboard.hasNextInt()){
            squareSize = keyboard.nextInt();
            if(squareSize <= 0){
                System.out.println("Enter a positive integer: ");
            } else {
                break;
            }
            } else {
                // String junk = keyboard.nextLine();
                System.out.println("Enter an number: ");
            }
        }
    
    // For loop for printing the checkerboard
    for(int i=0;i<height;i++){
        for(int j=0;j<width;j++){
            if(i % squareSize == 0){
                if(j % squareSize == 0){
                    System.out.print("+");
                }
                if(j % squareSize > 0 && j % squareSize <= squareSize - 1){
                    System.out.print("-");
                }
            } else {
                if(j % squareSize == 0){
                    System.out.print("|");
                }
                else if((i/squareSize)%2 == 0 && (j/squareSize)%2 == 0 || (i/squareSize)%2 != 0 && (j/squareSize)%2 != 0){
                    System.out.print("#");
                }
                else
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        keyboard.close();
    }
}