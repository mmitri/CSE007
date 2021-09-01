// Mark Mitri
// CSE 002
// 04/19/2020
// Exam 03

public class Overloading {
    public static void main(String[] args){
        String test1 = z("apple", 5, 2.13);
        System.out.println(test1);
        double test2 = z(3.3,0.0,"cherry");
        System.out.println(test2);
        int test3 = z(z(10.0,2.5,"gold"), 5);
        System.out.println(test3);
        double test5 = z(1.6,5);
        System.out.println(test5);
        double test4 = z(z(1.6,5),.5,"star");
        System.out.println(test4);
    }
    
    public static String z(String a, int b, double c){
        c = b + 2.5;
        System.out.println("This printed from the first method.");
        return a + b + c;
    }

    public static int z(double a, int b){
        a++;
        int s = (int)a*10+b;
        b++;
        System.out.println("This printed from the second method.");
        return s;
    }

    public static double z(double a, double b, String c){
        String r = b + c + "dream";
        double var = a;
        System.out.println("This printed from the third method.");
        return var/b;
    }
}