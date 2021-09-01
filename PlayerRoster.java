// Mark Mitri
// CSE 002
// 04/08/2020
// Lab 09

import java.util.Scanner;

public class PlayerRoster {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // Declaring my variables
        char menuOption = ' ';
        int soccorPlayers = 5;
        int[] jerseyNum = new int[soccorPlayers];
        int[] playerRating = new int[soccorPlayers];
        int i;
        int j;
        int newPlayerRating;
        int newJerseyNum;

        // For loop to store player rating and jersey number
        // into an array.
        for (i = 0; i < soccorPlayers; i++) {
            System.out.println("Enter player " + (i + 1) + "'s jersey number (0-99): ");
            jerseyNum[i] = keyboard.nextInt();
            System.out.println("Enter player " + (i + 1) + "'s rating (1-9): ");
            playerRating[i] = keyboard.nextInt();
            System.out.println(" ");
        }

        // For loop to print all the players and their number and rating.
        for (i = 0; i < soccorPlayers; i++) {
            System.out.println("Player " + (i + 1) + " | Jersey Number: " + jerseyNum[i] + " Rating: " + playerRating[i]);
        }

        // Do while loop to handle which menu option the user picks.
        do {
            System.out.println("\nMENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println("\nChoose an option:");
            menuOption = keyboard.next().charAt(0);
            // If statement for updating player rating.
            if (menuOption == 'u') {
                System.out.println("Enter a jersey number:");
                newJerseyNum = keyboard.nextInt();
                System.out.println("Enter a new rating for player:");
                newPlayerRating  = keyboard.nextInt();
                for (i = 0; i < soccorPlayers; ++i) {
                    if (jerseyNum[i] == newJerseyNum) 
                        playerRating[i] = newPlayerRating;
                }
            // If statement for printing players who have
            // a rating above a certain number.
            }else if (menuOption == 'a') {
                System.out.println("Enter a rating:");
                newPlayerRating  = keyboard.nextInt();
                System.out.println("\nABOVE " + playerRating);
                for (i = 0; i < soccorPlayers; ++i) {
                    if (playerRating[i] > newPlayerRating)
                        System.out.println("Player " + (i + 1) + " | Jersey Number: " + jerseyNum[i] + " Rating: " + playerRating[i]); 
                }
            // If statement for replaceing a player.
            }else if (menuOption == 'r') {
                System.out.println("Enter a jersey number:");
                newJerseyNum = keyboard.nextInt();
                j = -1;
                for (i = 0; i < soccorPlayers; ++i) {
                    if (newJerseyNum == jerseyNum[i])
                    j = i;
                }
                if (j != -1) {         
                    System.out.println("Enter a new jersey number:");
                    newJerseyNum = keyboard.nextInt();
            
                    System.out.println("Enter a rating for the new player:");
                    newPlayerRating  = keyboard.nextInt();
              
                    jerseyNum[j] = newJerseyNum;
                    playerRating[j] = newPlayerRating;
                }
            // If statement to print the updated roster.
            }else if (menuOption == 'o') {
                System.out.println("ROSTER");
                for (i = 0; i < soccorPlayers; ++i)
                    System.out.println("Player " + (i + 1) + " | Jersey Number: " + jerseyNum[i] + " Rating: " + playerRating[i]);
            }
        }while(menuOption != 'q');
        keyboard.close();
    }
}