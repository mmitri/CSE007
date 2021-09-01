// Mark Mitri
// CSE 002
// 04/19/2020
// Exam 03


import java.util.Scanner;
import java.util.StringJoiner;

public class ChapterSelection{
    public static void main(String[] args){

        // Declaring my variables
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the chapters to read: ");
        String chapters = keyboard.nextLine();
        // replacing all the non-integer characters
        chapters = chapters.replaceAll("[^01]", "");
        int numofChpts = 0;
        boolean[] chptSelected = new boolean[chapters.length()];

        // Counts the number of chapters needed to read
        for (int i = 0; i < chapters.length(); i++) {
            chptSelected[i] = chapters.charAt(i) == '1';
            if (chptSelected[i]) {
                numofChpts++;
            }
        }

        // If statement to print the correct line
        if (numofChpts == 0) {
            System.out.println("No chapters to read.");
            keyboard.close();
            return;
        } else if (numofChpts == 1) {
            System.out.print("Read chapter ");
        } else {
            System.out.print("Read chapters ");
        }

        // Prints out the chapters to read
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < chptSelected.length; i++) {
            if (chptSelected[i]) {
                sj.add(String.valueOf(i + 1));
            }
        }
        System.out.println(sj);
        keyboard.close();
    }
}