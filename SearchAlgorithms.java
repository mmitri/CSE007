// Mark Mitri
// CSE 002
// 04/22/2020
// Lab 011/HW 010

import java.util.*;

public class SearchAlgorithms{
    public static void main (String[] args){
        // Declaring my variables and sorting out the inputs
        System.out.println("What size 1D array would you like?");
		Scanner scnr = new Scanner(System.in);
		int size = scnr.nextInt();
		System.out.println("Enter 1 for a random array, " +
				"2 for an array in ascending order and " +
				"3 for an array in descending order.");
		int arrayType = scnr.nextInt();
        int[] arrayToPlay = new int[size];
        
        // If statement to select which array the user wants
		if (arrayType == 1) {
            arrayToPlay = randomArray1d(size);
            System.out.println("=======================================");
            System.out.println(Arrays.toString(arrayToPlay));
            System.out.println("=======================================");
		}
		else if (arrayType == 2) {
            arrayToPlay = ascendArray1d(size);
            System.out.println("=======================================");
            System.out.println(Arrays.toString(arrayToPlay));
            System.out.println("=======================================");
		}
		else if (arrayType == 3) {
            arrayToPlay = reverseArray1d(size);
            System.out.println("=======================================");
            System.out.println(Arrays.toString(arrayToPlay));
            System.out.println("=======================================");
        }
        
        // Asking for the key
		System.out.println("What number would you like to search for?");
		int key = scnr.nextInt();
        int index = linearSearch1d(arrayToPlay,key);
        
        // If statement to print whether or not the key was found and where
		if (index != -1) {
			System.out.println("Your key was found at index " + index);
		}
		else {
			System.out.println("Your key was not found");
		}

        // If statement to preform a search on the array
		if (arrayType == 2) {
			System.out.println("Performing a binary search on your sorted array.");
			index = binarySearch1d(arrayToPlay,key);
			if (index != -1) {
				System.out.println("Your key was found at index " + index);
			}
			else {
				System.out.println("Your key was not found");
			}
		}

        // Declaring and inputing the size of the 2D array
		System.out.println("Enter the number of rows in your 2D array: ");
		int rows = scnr.nextInt();
		System.out.println("Enter the number of columns in your 2D array: ");
		int cols = scnr.nextInt();
        int[][] randomArray2dim = randomArray2d(rows,cols);
        System.out.println("======================");
		for (int i = 0; i < rows; i++) {
			System.out.println(Arrays.toString(randomArray2dim[i]));
        }
        System.out.println("=======================");

        // Asking for the key
		System.out.println("Enter a number to search for in your 2D array: ");
		key = scnr.nextInt();
        int[] indexArray = linearSearch2d(randomArray2dim,key);
        
        // If statement whether or not the key was found and where
		if (indexArray[0] != -1) {
			System.out.println("Your key was found in row " + 
					indexArray[0] + ", column " + indexArray[1] );
		}
		else {
			System.out.println("Your key was not found");
		}
        scnr.close();
    }

    // Method for creating a random number 1D array
    // Parameter includes the length of the array
    // Returns the random array
    public static int[] randomArray1d(int arrayLength){
        int[] randomNumArray = new int[arrayLength];
        for(int i = 0;i<randomNumArray.length;i++)
            randomNumArray[i] = (int) (Math.random() * 100);
        return randomNumArray;
    }

    // Method for creating a random number 1D array in ascending order
    // Parameters include the length of the array
    // Returns the random array in ascending order
    public static int[] ascendArray1d(int arrayLength){
        int[] randomAscendArray = new int[arrayLength];
        int temp;
        for(int i = 0;i<randomAscendArray.length;i++)
            randomAscendArray[i] = (int) (Math.random()*100);
        for(int j=0;j<randomAscendArray.length;j++){
            for(int k=j+1;k<randomAscendArray.length;k++){
                if(randomAscendArray[j] > randomAscendArray[k]){
                    temp = randomAscendArray[j];
                    randomAscendArray[j] = randomAscendArray[k];
                    randomAscendArray[k] = temp;
                }
            }
        }
        return randomAscendArray;
    }

    // Method for creading the random 1D array in descending order
    // Parameters include the length of the array
    // Returns the random 1D array in descending order
    public static int[] reverseArray1d(int arrayLength){
        int[] randomDescendArray = new int[arrayLength];
        int temp;
        for(int i = 0;i<randomDescendArray.length;i++)
            randomDescendArray[i] = (int) (Math.random()*100);
        for(int j=0;j<randomDescendArray.length;j++){
            for(int k=j+1;k<randomDescendArray.length;k++){
                if(randomDescendArray[k] > randomDescendArray[j]){
                    temp = randomDescendArray[k];
                    randomDescendArray[k] = randomDescendArray[j];
                    randomDescendArray[j] = temp;
                }
            }
        }
        return randomDescendArray;
    }

    // Method for linear searching a 1D array 
    // Parameters include the array to search and the key
    // Returns the index or false
    public static int linearSearch1d(int[] list, int key){
        for(int i = 0;i<list.length;i++)
            if(key==list[i])
                return i;
        return -1;
    }

    // Method for binary seaching a 1D array
    // Parameters include the array to search and the key
    // Returns the index or false
    public static int binarySearch1d(int[] list, int key){
        int low = 0; 
        int high = list.length-1;
        while(high >= low){
            int mid = (low + high)/2;
            if(key < list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    // Method for creating a random 2D array
    // Parameters include the number of rows and collumns
    // Returns the random 2D array
    public static int[][] randomArray2d(int rows, int cols){
        int[][] random2DArray = new int[rows][cols];
        for(int i=0;i<random2DArray.length;i++){
            for(int j=0;j<random2DArray[i].length;j++){
                random2DArray[i][j] = ((int) (Math.random()*10));
            }
        }
        return random2DArray;
    }

    // Method for linear searching a 2D array
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