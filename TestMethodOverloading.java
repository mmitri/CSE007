// Mark Mitri
// CSE 002
// 04/01/2020
// Lab 08

public class TestMethodOverloading{
    public static void main(String[] args){
        // Calling the first method with int parameters
        int test1 = max(5, 10);
        // printing the variable associated with the return
        System.out.println(test1);

        // Calling the second method with double parameters
        double test2 = max(5.3,4.9);
        // printing the variable associated with the return
        System.out.println(test2);

        // Calling the third nmethod with double parameters
        double test3 = max(4.0,32.1,87.6);
        // printing the variable associated with the return
        System.out.println(test3);
    }

    // Method that takes in two integers and returns the largest
    public static int max(int num1, int num2){
        if(num1>num2)
            return num1;
        else
            return num2;
    }

    // Method that takes in two doubles and returns the largest
    public static double max(double num1, double num2){
        if(num1>num2)
            return num1;
        else
            return num2;
    }

    // Method that takes in three doubles and returns the largest
    // with the max function
    public static double max(double num1, double num2, double num3){
        return max(max(num1,num2),num3);
    }
}