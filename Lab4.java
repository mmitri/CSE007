// Mark Mitri
// CSE 002
// 2/12/2020
// Lab 4

public class Lab4{
    public static void main(String args[]){
        
        // Declaring variables (Strings)
        String suitName;
        String cardIdentity;

        // Math function of random int from 1-52 (inclusive)
        int number = (int)(Math.random() * (53-1) + 1);

        // If statement setting the value of suitName
        if( number <= 13 && number >= 1){
            suitName = "Diamonds";
        }
        else if( number <= 26 && number >= 14){
            suitName = "Clubs";
        }
        else if( number <= 38 && number >= 27){
            suitName = "Hearts";
        }
        else{
            suitName = "Spades";
        }

        // Switch statment setting the value of cardIdentity
        // and printing the statement
        switch(number){
            case 10: case 23: case 35: case 49: 
                    cardIdentity = "Jack";
                    System.out.println("You picked the " + cardIdentity + " of " + suitName);
                    break;
            case 11: case 24: case 36: case 50: 
                    cardIdentity = "Queen";
                    System.out.println("You picked the " + cardIdentity + " of " + suitName);
                    break;
            case 12: case 25: case 37: case 51: 
                    cardIdentity = "King";
                    System.out.println("You picked the " + cardIdentity + " of " + suitName);
                    break;
            case 13: case 26: case 38: case 52: 
                    cardIdentity = "Ace";
                    System.out.println("You picked the " + cardIdentity + " of " + suitName);
                    break;
            default: System.out.println("You picked the " + number + " of " + suitName);
        }
        
    }
}