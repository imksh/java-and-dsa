package misc;
import java.util.Scanner;

class SudukoSolver {
    public static boolean isSafe(char[][] board, int row, int col, int num) {
        char i = (char) (num + '0');
        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == i) {
                return false;
            }
        }
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == i) {
                return false;
            }
        }
        for (int r = (row / 3) * 3; r <= row + 3; r++) {
            for (int c = (col / 3) * 3; c <= c + 3; c++) {
                if (board[r][c] == i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col;
        } else {
            nrow = row + 1;
            ncol = 0;
        }
        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            for (int i = 0; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (board[row][col] != '.') {
                        helper(board, nrow, ncol);
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        System.out.println("Enter the Elements of SUDUKO \nNOTE : For empty cell enter '.' ");
        for (int i = 0; i < 9; i++) {
        //     for (int j = 0; j < 9; j++) {
        //         System.out.println("Element at index (" + i + "," + j + ")");
        //         board[i][j] = sc.next().charAt(0);
        //     }
        // }
       
        helper(board, 0, 0);
        System.out.println(board);
    }
}
};
