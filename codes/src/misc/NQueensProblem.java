//N Queen Problem by Backtracking method
package misc;

import java.util.ArrayList;
import java.util.Scanner;

class NQueensProblem {
    public static boolean isSafe(int row, int col, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        int r = row;
        for (int c = col; c >= 0 && r >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board, ArrayList<ArrayList<String>> allBoards) {
        String row = "";
        ArrayList<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] board, ArrayList<ArrayList<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

   
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Board : ");
        int n=sc.nextInt();
        ArrayList<ArrayList<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);
        System.out.println(allBoards);
    }
};
