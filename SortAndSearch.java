// Mark Mitri
// CSE 002
// 04/29/2020
// Lab 12

import java.util.Scanner;
import java.util.Arrays;

public class SortAndSearch{
    public static void main(String [] args){

        // Declaring my variables
        Scanner keyboard = new Scanner(System.in);
        int sizeArray, key, index;
        int[] unsortedArray, sortedArray;

        System.out.println("What size array would you like?");
        sizeArray = keyboard.nextInt();
        // Assigning the length to the arrays
        unsortedArray = new int[sizeArray];
        sortedArray = new int[sizeArray];

        unsortedArray = randomArray1d(sizeArray);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("Your array in descending order (using insertion sort): ");
        sortedArray = insertionSort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Which key would you like to search for?");
        key = keyboard.nextInt();
        index = binarySearch1d(sortedArray,key);
        System.out.println("Your key was found at index " + index + " of your sorted array.");
        keyboard.close();
    }

    // Method for creating a random number 1D array
    // Random numbers are from 0 to arrayLength-1
    // Parameter includes the length of the array
    // Returns the random array
    public static int[] randomArray1d(int arrayLength){
        int min = 0;
        int max = arrayLength -1;
        int[] randomNumArray = new int[arrayLength];
        for(int i = 0;i<randomNumArray.length;i++)
            randomNumArray[i] = (int) (Math.random() * (max-min+1)+min);
        return randomNumArray;
    }

    // InsertionSort method recieved from CSE 002: Arielle Carr
    // Original comments designate with '*'
    // Commented out sections not needed
    // Reversed order of insertionSort
    public static int[] insertionSort(int[] list) { 
		// System.out.println(Arrays.toString(list));
		// *Initialize counter for iterations
		//int iterations = 0;
		// *For element list[i] in the array.....
		for (int i = 1; i < list.length; i++) {
			// *Insert list[i] into a sorted sublist list[0..i-1] \
			// *so that list[0..i] is sorted. 
			//iterations++;
			int temp;
			for(int j = i ; j > 0 ; j--){
                // By switching the comparison, you can sort in descending order
				if(list[j] > list[j-1]){ 
					temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
					//iterations++;
				}else {
				    break;
				}				
			}
			//System.out.println(Arrays.toString(list));
        }
        //return iterations;
		return list;
    }
    
    // BinarySearch method recieved from CSE 002: Arielle Carr
    // Reversed order of binarySearch
    public static int binarySearch1d(int[] list, int key){
        int low = 0; 
        int high = list.length-1;
        while(high >= low){
            int mid = (low + high)/2;
            // By switching the comparison, you can search in descending order
            if(key > list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

}