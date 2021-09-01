// Mark Mitri
// CSE 002
// Lab 07
// 03/25/2020

import java.util.Scanner;

public class Area {
  public static void main (String [] args) {
    String shape = " ";
    boolean checkShape = false;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Choose a shape to compute the area of.");
    System.out.println("You can choose from circle, triangle, or rectangle:");
    // Using a loop, determine the user input (continue to prompt the user if
    // they do not give one of the three options)
	while(!checkShape){
        if(scnr.hasNextLine()){
            shape = scnr.nextLine();
            // Once the user gives a valid shape, ask for the correct dimensions 
            // and call the appropriate method as:
            // double area = shapeNameArea(parameters given by user)
            if(shape.equals("rectangle")){
                System.out.println("Enter the length: ");
                double length = scnr.nextDouble();
                System.out.println("Enter the width: ");
                double width = scnr.nextDouble();
                double rectangle = rectangleArea(length, width);
                // Print the resulting area
                System.out.println("The area of your rectangle is: " + rectangle);
                checkShape = true;
            }else if(shape.equals("circle")){
                System.out.println("Enter the radius: ");
                double radius = scnr.nextDouble();
                double circle = circleArea(radius);
                // Print the resulting area
                System.out.println("The area of your circle is: " + circle);
                checkShape = true;
            }else if(shape.equals("triangle")){
                System.out.println("Enter the height: ");
                double height = scnr.nextDouble();
                System.out.println("Enter the base: ");
                double base = scnr.nextDouble();
                double triangle = triangleArea(height, base);
                // Print the resulting area
                System.out.println("The area of your triangle is: " + triangle);
                checkShape = true;
            }else{
                System.out.println("Not the right type of shape.");
                System.out.println("Enter either circle, triangle, or rectangle.");
            }
        }else{
            // String junkShape = scnr.nextLine();
            // junkShape.close();
            System.out.println("Not the right type.");
            System.out.println("Enter a shape to compute the area of.");
        }
    }
    scnr.close();
  }
                            
  public static double circleArea( double radius ) {
    // compute the area using the input radius and return
    double circle = (3.14)*radius*radius;
    return circle;
  }
  
  public static double triangleArea( double height, double base ) {
    // compute the area using the input base and height and return
    double triangle = .5*base*height;
    return triangle;
  }
  
  public static double rectangleArea( double length, double width ) {
       // compute the area using the input length and width and return
    double rectangle = length * width;
    return rectangle;
  }
  
}
