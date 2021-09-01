// Mark Mitri
// CSE 002
// 04/15/2020
// Lab 10 and HW 09

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){

        // Declaring my variables
        Scanner keyboard = new Scanner(System.in);
        String [][] board = new String[3][3];
        String player = "O";
        int row, column;
        boolean exitGame = false;
        board[0][0] = "-";
        board[0][1] = "-";
        board[0][2] = "-";
        board[1][0] = "-";
        board[1][1] = "-";
        board[1][2] = "-";
        board[2][0] = "-";
        board[2][1] = "-";
        board[2][2] = "-";
        printBoard(board);

        // While loop to run the game.
        while(!exitGame == true){
            System.out.println("Enter the placement of the " + player);
            System.out.print("Row: ");
            row = keyboard.nextInt();
            System.out.print("Column: ");
            column = keyboard.nextInt();
            
            // If statement to check if the position of the board is already taken.
            if(board[row][column] == "X" || board[row][column] == "O"){
                System.out.println("This spot is occupied. Enter a different spot.");
                printBoard(board);
                continue;
            }
            board[row][column] = player;
            printBoard(board);
            
            // If statement to check if the game has a winner
            if(winner(board)){
                System.out.println("Player " + player + " is the winner!");
                exitGame = true;
            }

            // Swaps the players
            if(player == "O"){
                player = "X";
            }else{
                player = "O";
            }

            // If statement to check if there is a tie.
            if(winner(board) == false && !emptySpace(board)){
                System.out.println("The game is a tie.");
            }
        }
        keyboard.close();
    }

    // Method for printing the board
    public static void printBoard(String[][] board){
        for(int row = 0; row<board.length;row++){
            for(int column = 0; column < board[row].length;column++){
                System.out.print(board[row][column] + " ");
            }
            System.out.println(" ");
        }
    }

    // Method to check if there is an empty space on the board
    // Returns true if there is an empty space, false otherwise
    public static boolean emptySpace(String[][] board){
        for(int row = 0;row<board.length;row++){
            for(int column = 0;column<board[0].length;column++){
                if(board[row][column] != "O" && board[row][column] != "X"){
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check what type of win condition
    public static boolean winner(String[][] board){
        return horizontalWin(board) || verticalWin(board) || diagonalWin(board);
    }

    // Method to check for the spaces on the board if they are
    // empty or have the same text
    // Returns true if all the spaces are the same text, false otherwise
    public static boolean isWin(String[] temperate){
        boolean win = true;
        String temp = "-";
        for(String character: temperate){
            if(temp == "-"){
                temp = character;
            }
            if("O" != character && "X" != character){
                win = false;
                break;
            }else if(temp != character){
                win = false;
                break;
            }
        }
        return win;
    }

    // Method to check for horizontal win
    // Returns true if there is a win, false otherwise
    public static boolean horizontalWin(String[][] board){
        for(int row = 0; row < board.length; row++){
            if(isWin(board[row])){
                return true;
            }
        }
        return false;
    }

    // Method to check for a vertical win
    // Returns true if vertical win, false otherwise
    public static boolean verticalWin(String[][] board){
        String[] column = null;
        for(int col = 0; col < board[0].length; col++){
            column = new String[board[0].length];
            for(int row = 0; row < column.length; row++){
                column[row] = board[row][col];
            }
            if(isWin(column))
                return true;
        }
        return false;
    }

    // Method to check for diagonal win
    // Returns true if diagonal win, false otherwise
    public static boolean diagonalWin(String[][] board){
        int row = 0, column = 0;
        int columns = board.length;
        int rows = board[0].length;
        int size = rows<columns ? rows : columns;
        String[] diagonal = new String[size];

        while(row<rows&&column<columns){
            diagonal[column] = board[row][column];
            row++;
            column++;
        }
        if(isWin(diagonal)){
            return true;
        }
        row = rows - 1;
        column = 0;
        diagonal = new String[size];
        while(row >= 0 && column < columns){
            diagonal[column] = board[row][column];
            row--;
            column++;
        }
        return isWin(diagonal);
    }
}