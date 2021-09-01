// Mark Mitri
// CSE 002
// 04/19/2020
// Exam 03

public class PrintTable {
    public static void main(String[] args){

        // Initializing and declaring the 2D array
        int[][] distances = {
            {0, 983, 787, 714, 1375, 967, 1087},
            {983, 0, 214, 1102, 1763, 1723, 1842},
            {787, 214, 0, 888, 1549, 1548, 1627},
            {714, 1102, 888, 0, 661, 781, 810},
            {1375, 1763, 1549, 661, 0, 1426, 1187},
            {967, 1723, 1548, 781, 1426, 0, 239},
            {1087, 1842, 1627, 810, 1187, 239, 0},
        };

        // Printing out the 2D array in a nice table.
        System.out.println("                      Distance Table(in miles)");
        System.out.println("_____________________________________________________________________");
        System.out.println("          Chicago  Boston  New York  Atlanta  Miami  Dallas  Houston");
        System.out.println("_____________________________________________________________________");
        System.out.println("Chicago         " + distances[0][0] + "     " + distances[0][1] + "       " + distances[0][2] + "      " + distances[0][3] + "   " + distances[0][4] + "     " + distances[0][5] + "     " + distances[0][6]);
        System.out.println("Boston        " + distances[1][0] + "       " + distances[1][1] + "       " + distances[1][2] + "     " + distances[1][3] + "   " + distances[1][4] + "    " + distances[1][5] + "     " + distances[1][6]);
        System.out.println("New York      " + distances[2][0] + "     " + distances[2][1] + "         " + distances[2][2] + "      " + distances[2][3] + "   " + distances[2][4] + "    " + distances[2][5] + "     " + distances[2][6]);
        System.out.println("Atlanta       " + distances[3][0] + "    " + distances[3][1] + "       " + distances[3][2] + "        " + distances[3][3] + "    " + distances[3][4] + "     " + distances[3][5] + "      " + distances[3][6]);
        System.out.println("Miami        " + distances[4][0] + "    " + distances[4][1] + "      " + distances[4][2] + "      " + distances[4][3] + "      " + distances[4][4] + "    " + distances[4][5] + "     " + distances[4][6]);
        System.out.println("Dallas        " + distances[5][0] + "    " + distances[5][1] + "      " + distances[5][2] + "      " + distances[5][3] + "   " + distances[5][4] + "       " + distances[5][5] + "      " + distances[5][6]);
        System.out.println("Houston      " + distances[6][0] + "    " + distances[6][1] + "      " + distances[6][2] + "      " + distances[6][3] + "   " + distances[6][4] + "     " + distances[6][5] + "        " + distances[6][6]);
    }
}
