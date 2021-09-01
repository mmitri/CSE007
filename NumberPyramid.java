// Mark Mitri
// CSE 002
// 3/4/2020
// Lab 6

import java.util.Scanner;

public class NumberPyramid{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean checkInt = false, checkChar = false;
        int sizePyr = 0;
        char whichPyr = 'Z';
        System.out.println("Enter a letter for the type of pyramid pattern (A,B,C,D): ");
        while(!checkChar){
            if(input.hasNextLine()){
               whichPyr = input.next().charAt(0); 
               if( !(whichPyr == 'A' || whichPyr == 'B' || whichPyr == 'C' || whichPyr == 'D')){
                    System.out.println("Not one of the choices");
                    System.out.println("Enter a letter.");
               }else{
                    checkChar = true; 
               }
            }else{
                // String junkChar = input.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a letter.");
            }
        }
        System.out.println("Enter size of Pyramid (1-10): ");
        while(!checkInt){
            if(input.hasNextInt()){
               sizePyr = input.nextInt(); 
               if(sizePyr < 1 || sizePyr > 10){
                    System.out.println("Not a number of a month.");
                    System.out.println("Enter a positive number.");
               }else{
                    System.out.println(" ");
                    checkInt = true; 
               }
            }else{
                // String junkInt = input.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a positive number.");
            }
        }
        if(whichPyr == 'A'){
            for(int numRows=1;numRows<=sizePyr;numRows++){
                for(int i=1;i<=numRows;i++){
                System.out.print(i + " ");
                }
                System.out.println(" ");
            }
        }
        if(whichPyr == 'B'){
            for(int numRows=sizePyr;numRows>=1;numRows--){ 
                for(int i=1;i<=numRows;i++){
                    System.out.print(i + " ");
                }
                System.out.println(" ");
            }
        }
        if(whichPyr == 'C'){
            for(int numRows=1;numRows<=sizePyr;numRows++){
                for(int j=sizePyr;j>=numRows;j--){
                    System.out.print("  ");
                }
                for(int i=1;i<=numRows;i++){
                    System.out.print(i + " ");
                }
                System.out.println(" ");
            }
        }
        if(whichPyr == 'D'){
            for(int numRows=sizePyr;numRows>=1;numRows--){
                for(int i=numRows;i>=1;i--){
                    System.out.print(i + " ");
                    }
                    System.out.println();
            }
        }
        input.close();
    }
}