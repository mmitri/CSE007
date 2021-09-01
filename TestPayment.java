import java.util.Scanner;
public class TestPayment {
  public static void main (String[] args){
	double x, y, z;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter the first number (1.0-9.0): ");
	x = keyboard.nextDouble();
	if (x == 10.0){
  		x = 9.0;
	}
	System.out.print("Enter the second number (1.0-9.0): ");
	y = keyboard.nextDouble();
	if (y == 10.0) {
  		y = 9.0;
	}
	System.out.print("Enter the third number (1.0-9.0): ");
	z = keyboard.nextDouble();
	if (z == 10.0) {
  		z = 9.0;
    }
    
	if ( y > x && y > z){
       x = y;
    }
	else if(z > x && z > y){
        x = z;
    }
    System.out.println("The maximum is " + x);
    keyboard.close();
  }
}
