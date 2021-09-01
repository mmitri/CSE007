// Mark Mitri
// CSE 002
// 04/11/2020
// HW 008

import java.util.Scanner;

public class DeckOfCards{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String[] suits = {"S","H","D","C"};
        String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int cards = 52;
        int[] list = new int[cards];
        int index = 5;
        int numCards;
        boolean exit = false;


        printArray(list, suits, ranks);
        shuffle(list, suits, ranks);

        System.out.println("Enter a hand-size: ");
        while(!exit){
            if(keyboard.hasNextInt()){
                numCards = keyboard.nextInt();
                if(numCards > 52){
                    System.out.println("Too large of a hand, please input a hand-size: ");
                }else if(numCards < 1){
                    System.out.println("Too small of a hand, please input a hand-size: ");
                    
                }else{
                    getHand(list, index, numCards);
                }
            }else{
                exit = true;
            }
        }
        keyboard.close();
    }
    public static void printArray(int[] list, String[] suits, String[] ranks){
        for(int i = 0; i < list.length;i++){
            list[i] = i;
        }
        System.out.print("The deck in order: ");
        for (int i = 0; i < 52; i++) {
            String suit = suits[list[i] / 13];
            String rank = ranks[list[i] % 13];
            System.out.print( rank + suit + " ");
        }
        System.out.println(" ");
    }

    public static void shuffle(int[] list, String[] suits, String[] ranks){
        for (int i = 0; i < list.length; i++) {
            int index = (int)(Math.random() * list.length);
            int temp = list[i];
            list[i] = list[index];
            list[index] = temp;
        }
        System.out.println("The deck shuffled: ");
        for (int i = 0; i < 52; i++) {
            String suit = suits[list[i] / 13];
            String rank = ranks[list[i] % 13];
            System.out.print( rank + suit + " ");
        }
        System.out.println(" ");
    }

    public static void getHand(int[] list, int index, int numCards){
        System.out.print("Your hand: ");
        for(int i = 0; i < numCards;i++){
            System.out.print(list[i] + " ");
            
        }
        System.out.println(" ");
        System.out.println("Please input a hand-size: ");
    }
}