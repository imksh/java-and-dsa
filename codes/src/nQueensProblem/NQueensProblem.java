package nQueensProblem;

import java.util.*;

public class NQueensProblem 
{

	public static void main(String[] args) 
	{
		int n=4;
        char[][] board = new char[n][n];
        
        System.out.println("One Solution");
        for(char[] row : board) Arrays.fill(row,'.');
        oneSolution(0,board);
        
        System.out.println("All Solution");
        for(char[] row : board) Arrays.fill(row,'.');
        allSolution(0, board);
        
        
    }

    static boolean oneSolution(int row , char[][] board)
    {
        if(row==board.length) 
        	{
	        	for(char[] r : board)
	        {
	         	System.out.print("[");
	        		System.out.println(new String(r) + "]");
	        }
	        	System.out.println();
        		return true;
        	}
        
        
        for(int i=0;i<board[0].length;i++)
        {
            if(isSafe(row,i,board))
            {
                board[row][i]='Q';
                if(oneSolution(row+1,board))
                {
                		return true;
                }
                board[row][i]='.';
            }
        }
        return false;
    }
    
    static void allSolution(int row , char[][] board)
    {
        if(row==board.length) 
        {
        		for(char[] r : board)
	        {
	         	System.out.print("[");
	        		System.out.println(new String(r) + "]");
	        }
        		System.out.println();
            return;
        }
        
        for(int i=0;i<board[0].length;i++)
        {
            if(isSafe(row,i,board))
            {
                board[row][i]='Q';
                allSolution(row+1,board);
                board[row][i]='.';
            }
        }
    }
    
    

    static boolean isSafe(int row, int col, char[][] board)
    {
        //column check

        for(int i=0;i<row;i++)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        
        //upper left diagonal
        int i=row-1;
        int j= col-1;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }

        //upper right diagonal
        i=row-1;
        j= col+1;
        while(i>=0 && j<board[0].length)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

}
