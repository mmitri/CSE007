
import java.util.Scanner;
import java.util.StringJoiner;

public class ChapterSelection1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the chapters to read: ");
        String chapters = keyboard.nextLine();
        chapters = chapters.replaceAll("[^01]", "");
        int numofChpts = 0;
        boolean[] chptSelected = new boolean[chapters.length()];
        for (int i = 0; i < chapters.length(); i++) {
            chptSelected[i] = chapters.charAt(i) == '1';
            if (chptSelected[i]) {
                numofChpts++;
            }
        }
        if (numofChpts == 0) {
            System.out.println("No chapters to read.");
            return;
        } else if (numofChpts == 1) {
            System.out.print("Read chapter ");
        } else {
            System.out.print("Read chapters ");
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < chptSelected.length; i++) {
            if (chptSelected[i]) {
                sj.add(String.valueOf(i + 1));
            }
        }
        System.out.println(sj);
    }
}