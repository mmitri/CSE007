import java.util.Scanner;
public class TestLab5{
 public static void main(String[] args){
        char answer;
        do {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the gender of the child (F/M)");
        char gender = keyboard.next().charAt(0);
        System.out.print("Enter the height of the mother in inches:");
        int heightMother = keyboard.nextInt();
        System.out.print("Enter the height of the father in inches:");
        int heightFather = keyboard.nextInt();
        int heightChild;
        if (gender == 'F'){
            heightChild= (heightFather * 12 / 13 + heightMother)/2;
        } else{
            heightChild = (heightMother * 13 / 12 + heightFather)/2;
        }
        System.out.println("The predicted height of the child in inches is " + heightChild + " in.");
        System.out.print("\nDo you want to continue with another child (y/n):");
        answer = keyboard.next().charAt(0);
        keyboard.close();
   } while (answer == 'y');
 }
}
