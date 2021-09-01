import java.util.Scanner;

public class TwistGenerator{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in); 
        boolean valid = false;
        System.out.println("Input a positive integer: ");
        while (!valid){
            if(keyboard.hasNextInt()){
                int posInt = keyboard.nextInt();
                if (posInt <= 0){
                    System.out.println("Not a positive number.");
                    System.out.println("Enter a positive number: ");
                } 
                else
                    valid = true;
                    int f = posInt;
                    int g = posInt;
                    int i = 0;
                    while(i < posInt){
                        System.out.print("\\ /");
                        posInt = posInt - 1;
                    }
                    System.out.println(" ");
                    while(i < f){
                        System.out.print(" X ");
                        f = f - 1;
                    }
                    System.out.println(" ");
                    while(i < g){
                        System.out.print("/ \\");
                        g = g - 1;
                    }
            }
            else{
                String junk = keyboard.next();
                System.out.println(junk);
                System.out.println("Not the right type.");
                System.out.println("Enter a positive number: ");
            }
            
        }
        keyboard.close();
    }
}