// Mark Mitri
// CSE 002
// 05/08/2020
// Final Exam Program

import java.util.Scanner;
import java.util.Arrays;

public class FinalExamProgram {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        boolean exitLoop = false;
        char menuSelect = ' ';
        int total = 0;

        menuSelect = printMenu(keyboard);
        // Structure of while loop recieved from Arielle Carr: CSE 002 HW 07
        while(!exitLoop){
            if(!(menuSelect == 'A' || menuSelect == 'B' 
              || menuSelect == 'C' || menuSelect == 'D' 
              || menuSelect == 'F' || menuSelect == 'G'
              || menuSelect == 'X')){
              System.out.println("Not a correct menu");
              menuSelect = printMenu(keyboard);
            }else if(menuSelect == 'X'){
                System.out.println("I can't wait to go back to Lehigh!");
                exitLoop = true;
            }else if(menuSelect == 'A'){
                int[] minMaxAvgArray = new int[10];
                System.out.println("Enter 10 integers");
                // For loop for initializing the array,
                // while also checking for wrong input
                for(int i = 0;i<minMaxAvgArray.length;i++){
                    int userInt = keyboard.nextInt();
                    if(!(keyboard.hasNextInt())){
                        System.out.println("Wrong input. Enter integers only");
                        continue;
                    }else{
                        minMaxAvgArray[i] = userInt;
                        // Totals the value in the for loop
                        total = total + minMaxAvgArray[i];
                    }
                }
                int userAvg = minMaxAvg(keyboard,total, minMaxAvgArray);
                System.out.println("Average of input: " + userAvg);
                System.out.println("");
                menuSelect = printMenu(keyboard);
            }else if(menuSelect == 'B'){
                System.out.println("Enter a license plate number: ");
                String licNum = keyboard.nextLine();
                String userLicense = licensePlate(keyboard, licNum);
                System.out.println("Old license plate number: " + licNum);
                System.out.println("New license plate number: " + userLicense);
                System.out.println("");
                menuSelect = printMenu(keyboard);
            }else if(menuSelect == 'C'){
                System.out.println("Enter a number: ");
                int userInt = keyboard.nextInt();
                String formatInt = commasInt(keyboard, userInt);
                System.out.println("Formated number: " + formatInt);
                System.out.println("");
                menuSelect = printMenu(keyboard);
            }else if(menuSelect == 'D'){
                System.out.println("Enter the size of the matrix: ");
                int sizeMat = keyboard.nextInt();
                int[][] userTriDag = tridiagMat(keyboard,sizeMat);
                // If statement to print the TriDiagonal Matrices
                // I noticed a patern of three rows of 1s moving over one row
                // but I couldn't figure it out in a method
                if(sizeMat == 1){
                    userTriDag[0][0] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 2){
                    userTriDag[0][0] = 1;
                    userTriDag[1][1] = 0;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 3){
                    userTriDag[0][0] = 1; userTriDag[0][1] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][1] = 1; userTriDag[2][2] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 4){
                    userTriDag[0][0] = 1; userTriDag[0][1] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][1] = 1; userTriDag[2][1] = 1; userTriDag[2][2] = 1;
                    userTriDag[3][2] = 1; userTriDag[3][3] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 5){
                    userTriDag[0][1] = 1; userTriDag[0][2] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][1] = 1; userTriDag[2][2] = 1; userTriDag[2][3] = 1;
                    userTriDag[3][2] = 1; userTriDag[3][3] = 1; userTriDag[3][4] = 1;
                    userTriDag[4][3] = 1; userTriDag[4][4] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 6){
                    userTriDag[0][0] = 1; userTriDag[0][1] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][0] = 1; userTriDag[2][1] = 1; userTriDag[2][2] = 1; userTriDag[2][3] = 1;
                    userTriDag[3][1] = 1; userTriDag[3][2] = 1; userTriDag[3][3] = 1; userTriDag[3][4] = 1;
                    userTriDag[4][2] = 1; userTriDag[4][3] = 1; userTriDag[4][4] = 1; userTriDag[4][5] = 1;
                    userTriDag[5][3] = 1; userTriDag[5][4] = 1; userTriDag[5][5] = 1;
                    userTriDag[6][4] = 1; userTriDag[6][5] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 7){
                    userTriDag[0][0] = 1; userTriDag[0][1] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][1] = 1; userTriDag[2][2] = 1; userTriDag[2][3] = 1;
                    userTriDag[3][2] = 1; userTriDag[3][3] = 1; userTriDag[3][4] = 1;
                    userTriDag[4][3] = 1; userTriDag[4][4] = 1; userTriDag[4][5] = 1;
                    userTriDag[5][4] = 1; userTriDag[5][5] = 1; userTriDag[5][6] = 1;
                    userTriDag[6][5] = 1; userTriDag[6][6] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 8){
                    userTriDag[0][0] = 1; userTriDag[0][1] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][1] = 1; userTriDag[2][2] = 1; userTriDag[2][3] = 1;
                    userTriDag[3][2] = 1; userTriDag[3][3] = 1; userTriDag[3][4] = 1;
                    userTriDag[4][3] = 1; userTriDag[4][4] = 1; userTriDag[4][5] = 1;
                    userTriDag[5][4] = 1; userTriDag[5][5] = 1; userTriDag[5][6] = 1;
                    userTriDag[6][5] = 1; userTriDag[6][6] = 1; userTriDag[6][7] = 1;
                    userTriDag[7][6] = 1; userTriDag[7][7] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 9){
                    userTriDag[0][0] = 1; userTriDag[0][1] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][1] = 1; userTriDag[2][2] = 1; userTriDag[2][3] = 1;
                    userTriDag[3][2] = 1; userTriDag[3][3] = 1; userTriDag[3][4] = 1;
                    userTriDag[4][3] = 1; userTriDag[4][4] = 1; userTriDag[4][5] = 1;
                    userTriDag[5][4] = 1; userTriDag[5][5] = 1; userTriDag[5][6] = 1;
                    userTriDag[6][5] = 1; userTriDag[6][6] = 1; userTriDag[6][7] = 1;
                    userTriDag[7][6] = 1; userTriDag[6][7] = 1; userTriDag[7][8] = 1;
                    userTriDag[8][7] = 1; userTriDag[8][8] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }else if(sizeMat == 10){
                    userTriDag[0][0] = 1; userTriDag[0][1] = 1;
                    userTriDag[1][0] = 1; userTriDag[1][1] = 1; userTriDag[1][2] = 1;
                    userTriDag[2][1] = 1; userTriDag[2][2] = 1; userTriDag[2][3] = 1;
                    userTriDag[3][2] = 1; userTriDag[3][3] = 1; userTriDag[3][4] = 1;
                    userTriDag[4][3] = 1; userTriDag[4][4] = 1; userTriDag[4][5] = 1;
                    userTriDag[5][4] = 1; userTriDag[5][5] = 1; userTriDag[5][6] = 1;
                    userTriDag[6][5] = 1; userTriDag[6][6] = 1; userTriDag[6][7] = 1;
                    userTriDag[7][6] = 1; userTriDag[6][7] = 1; userTriDag[7][8] = 1;
                    userTriDag[8][7] = 1; userTriDag[8][8] = 1; userTriDag[8][9] = 1;
                    userTriDag[9][8] = 1; userTriDag[9][9] = 1;
                    System.out.println(Arrays.deepToString(userTriDag).replace("], ", "]\n").replace("[[","[").replace("]]","]").replace(", "," "));
                }
                System.out.println("");
                menuSelect = printMenu(keyboard);
            }else if(menuSelect == 'F'){
                transMat(keyboard);
                System.out.println("");
                menuSelect = printMenu(keyboard);
            }else if(menuSelect == 'G'){
                ragArraySearch(keyboard);
                System.out.println("");
                menuSelect = printMenu(keyboard);
            }
        }
    }
    // Method for printing the menu.
    // Recieved from Arielle Carr: CSE 002 HW 07
    // Parameters include the Scanner.
    // Returns a character.
    public static char printMenu(Scanner keyboard){
        System.out.println("Which would you like to test?");
        System.out.println("A - Min, Max, Average");
        System.out.println("B - Next License Plate Number");
        System.out.println("C - Commas in Integers");
        System.out.println("D - TriDiagonal Matrices");
        System.out.println("F - Transpose a Matrix");
        System.out.println("G - Ragged Array Search");
        System.out.println("X - Exit");
        char menuSelect = keyboard.next().charAt(0);
        return menuSelect;
    }
    // Method for finding the minimum, maximum, and average of an array
    // Parameters include Scanner keyboard
    // Void method: Just prints the information
    public static int minMaxAvg(Scanner keyboard, int total, int[] minMaxAvgArray){
        int avg = 0;
        int minVal = minMaxAvgArray[0];
        int maxVal = minMaxAvgArray[0];
        // For loop to check for the minimum value in the array
        for(int j = 1;j<minMaxAvgArray.length;j++){
            if(minMaxAvgArray[j] < minVal){
                minVal = minMaxAvgArray[j];
            }
        }
        // For loop to check for the maximum value in the array
        for(int k = 1;k<minMaxAvgArray.length;k++){
            if(minMaxAvgArray[k] > maxVal){
                maxVal = minMaxAvgArray[k];
            }
        }
        avg = total / minMaxAvgArray.length;
        System.out.println("Your input: " + Arrays.toString(minMaxAvgArray));
        System.out.println("Minimum number: " + minVal);
        System.out.println("Maximum number: " + maxVal);
        return avg;
    }
    // Method for incrementing a license plate number
    // Parameters include the Scanner keyboard, the string of the original license plate
    // as well as a throws Exception warning
    // Returns the incremented string 
    public static String licensePlate(Scanner keyboard, String licNum) throws Exception {
        // Converts the string input into a 1D char array
        char[] licNumArray = licNum.toCharArray();
        int temp = licNumArray.length - 1;
        while(true){
             if(temp==0){
                 throw new Exception("License plates have 6 numbers.");
             }
            licNumArray[temp]++;
            // If statements to check for the end of a number
            // and the end of the alphabet
            // Then, resets the values
            if(licNumArray[temp] - 1 == '9'){
                licNumArray[temp] = 'A';
            }
            if(licNumArray[temp] - 1 == 'Z'){
                licNumArray[temp] = '0';
                temp--;
                continue;
            }
            return new String(licNumArray);
        }
    }
    // Simple method that prints commas in an integer
    // Parameters include the Scanner keyboard and the integer from the user
    // Returns the formated string
    public static String commasInt(Scanner keyboard, int userInt){
        String userString = String.format("%,d", userInt);
        return userString;
    }
    // Method for TriDiagonal Matrix
    // Parameters include the Scanner keyboard and the size of the matrix
    // Returns the matrix
    public static int[][] tridiagMat(Scanner keyboard, int sizeMat){
        boolean exitLoop = false;
        while(!exitLoop){
            if(sizeMat > 10 || sizeMat < 0){
                System.out.println("Enter a positive number smaller than 10.");
            }else{
                int[][] triDag = new int[sizeMat][sizeMat];
                exitLoop = true;
                return triDag;
            }
        }
        return null;
    }
    // Method for transposing a matrix
    // Parameters include the Scanner keyboard
    // Void method
    public static void transMat(Scanner keyboard){
        System.out.println("Number of rows in your matrix: ");
        int numRow = keyboard.nextInt();
        System.out.println("Number of columns in your matrix: ");
        int numCol = keyboard.nextInt();
        int[][] userMatrix = new int[numRow][numCol];
        System.out.println("Enter integers into your matrix: ");
        for(int i=0;i<numRow;i++)
            for(int j = 0; j<numCol;j++)
                userMatrix[i][j] = keyboard.nextInt();
        System.out.println("Your matrix: ");
        for(int m = 0; m < numRow; m++){
            for(int n = 0; n < numCol; n++){
                System.out.print(userMatrix[m][n]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Transposed Matrix: ");
        for(int k = 0; k < numCol; k++){
            for(int l = 0; l < numRow; l++){
                System.out.print(userMatrix[l][k]+" ");
            }
            System.out.println(" ");
        }
    }
    // Method for searching a ragged array
    // Parameters include the Scanner keyboard
    // Also calls the linear search
    // Void method
    public static void ragArraySearch(Scanner keyboard){
        System.out.println("Enter the key you would like to search: ");
        int key = keyboard.nextInt();
        int numRows = (int)(Math.random()*5)+5;
        int[][] ragArray = new int[numRows][];
        for(int i = 0; i < ragArray.length; i++){
            int numCols = (int)(Math.random()*5)+5;
            ragArray[i] = new int[numCols];
            for(int j = 0; j < ragArray[i].length; j++){
                ragArray[i][j] = (int)(Math.random()*11);   
            }
        }
        System.out.println("==============================");
        for(int k=0;k<ragArray.length;k++){
            for(int l=0;l<ragArray[k].length;l++){
                System.out.print(ragArray[k][l] + " ");
            }
            System.out.println();
        }
        System.out.println("==============================");
        // If statement to print where key was found
        // recieved from CSE 002: Arielle Carr SortAndSearch lab 12
        int[] indexArray = linearSearch2d(ragArray,key);
        if (indexArray[0] != -1) {
			System.out.println("Your key was found in row " + 
					indexArray[0] + ", column " + indexArray[1] );
		}
		else {
			System.out.println("Your key was not found");
        }
    }
    // Method for linear searching a 2D array
    // linearSearch2d method recieved from CSE 002: Arielle Carr SortAndSearch lab 12
    // Parameters include the array to search and the key
    // Returns the index or false
    public static int[] linearSearch2d(int[][] searchArray2d, int key){
        int[] notFoundArray = {-1,-1};
        for(int i = 0; i<searchArray2d.length;i++){
            for(int j=0;j<searchArray2d[i].length;j++){
                if(searchArray2d[i][j] == key){
                    int[] returnArray = {i,j};
                    return returnArray;
                }
            }
        }
        return notFoundArray;
    }
}