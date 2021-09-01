// Mark Mitri
// CSE 002
// HW 07
// 03/29/2020

import java.util.Scanner;

public class WordTools{
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        // Declaring my variables
        boolean rightMenu = false;
        String output = " ";
        String findWord = " ";
        String quiteOutput = " ";
        String lessSpaces = " ";
        char menuOption = ' ';
        int numChar = -1;
        int numString = -1;
        int numWords = -1;

        // Taking input for the program
        output = sampleText(keyboard);
        System.out.println("You entered: " + output);
        menuOption = printMenu(keyboard);
        
        // While loop to check for correct menu option
        while(!rightMenu){
            if(!(menuOption == 'c' || menuOption == 'w' 
              || menuOption == 'f' || menuOption == 'r' 
              || menuOption == 's' || menuOption == 'q')){
                System.out.println("Not a correct menu");
                menuOption = printMenu(keyboard);
            // Menu option to quit
            }else if(menuOption == 'q'){
                rightMenu = true;
            // Menu option to count number of characters
            }else if(menuOption == 'c'){
                numChar = getNumOfNonWSCharacters(output);
                System.out.println("Number of non-whitespace characters: " + numChar);
                rightMenu = true;
            // Menu option to count the number of words
            }else if(menuOption == 'w'){
                numString = getNumOfWords(output);
                System.out.println("Number of words: " + numString);
                rightMenu = true;
            // Menu option to count the number of
            // user given words or phrases
            }else if(menuOption == 'f'){
                System.out.println("Enter a word or phrase to be found: ");
                findWord = keyboard.next();
                numWords = findText(findWord, output);
                System.out.println("\"" + findWord + "\"" + " instances: " + numWords);
                rightMenu = true;
            // Menu option to replace '!' with '.'
            }else if(menuOption == 'r'){
                quiteOutput = replaceExclamation(output);
                System.out.println("Edited Text: " + quiteOutput);
                rightMenu = true;
            // Menu option to remove all spaces
            }else if(menuOption == 's'){
                lessSpaces = shortenSpace(output);
                System.out.println("Edited Text: " + lessSpaces);
                rightMenu = true;
            }
        }
        keyboard.close();
    }
    
    // Method for taking the sample text from the user.
    // Parameters include the Scanner.
    // Returns a string.
    public static String sampleText(Scanner keyboard){
        System.out.println("Enter a sample text: ");
        String output = keyboard.nextLine();
        return output;
    }

    // Method for printing the menu.
    // Parameters include the Scanner.
    // Returns a character.
    public static char printMenu(Scanner keyboard){
        System.out.println(" ");
        System.out.println("MENU");
        System.out.println("c - Number of non-whitespace characters");
        System.out.println("w - Number of words");
        System.out.println("f - Find text");
        System.out.println("r - Replace all !'s");
        System.out.println("s - Shorten spaces");
        System.out.println("q - Quit");
        System.out.println(" ");
        System.out.println("Choose an option: ");
        char menuOption = keyboard.next().charAt(0);
        return menuOption;
    }

    // Method for counting the non-whitespace characters.
    // Parameters include the sample text.
    // Returns an integer.
    public static int getNumOfNonWSCharacters(String output){
        int numChar = 0;
        char temp;
        for(int i = 0; i<output.length();i++){
            temp = output.charAt(i);
            if(temp != ' ')
                numChar++;
        }
        return numChar;
    }

    // Method for counting the number of words.
    // Parameters include the sample text
    // Returns an integer.
    public static int getNumOfWords(String output){
        int numWords = 0;
        char temp;
        for(int j = 0;j<output.length();j++){
            temp = output.charAt(j);
            if(temp == ' ')
                numWords++;
        }
        return numWords;
    }

    // Method for finding the number of user given
    // words or phrases in the sample text.
    // Parameters include the user given word or phrase
    // and the sample text.
    // Returns an integer.
    public static int findText(String findWord, String output){
        int numWords = 0;
        int temp = 0;
        while(temp != -1){
            temp = output.indexOf(findWord,temp);
            if(temp != -1){
                numWords++;
                temp += findWord.length();
            }
        }
        return numWords;
    }

    // Method for replacing '!' with '.'
    // Parameters include the sample text
    // Returns a string.
    public static String replaceExclamation(String output){
        char temp;
        String quiteOutput = " ";
        for(int g = 0;g<output.length();g++){
            temp = output.charAt(g);
            if(temp == '!')
                quiteOutput = output.replace(temp,'.');
        }
        return quiteOutput;
    }

    // Method for removing all the spaces in the sample text.
    // Parameters include the sample text.
    // Returns a string.
    public static String shortenSpace(String output){
        String lessSpaces = output.trim().replaceAll(" +"," ");
        return lessSpaces;
    }
    
}