package sudukoSolver;

import java.util.Arrays;

public class Main 
{

	public static void main(String[] args) 
	{
		
		System.out.println("One Solution");
		char[][] board = 
			{
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
			};
        boolean[] isSolved = new boolean[1];
        oneSolution(0,0,board,isSolved);
        
        

		System.out.println("All Solution");
		char[][] board1 = {
			    {'.', '.', '.', '.', '.', '.', '.', '.', '2'},
			    {'.', '.', '.', '.', '.', '.', '6', '.', '.'},
			    {'.', '.', '1', '.', '9', '5', '.', '.', '.'},
			    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			    {'.', '6', '.', '5', '.', '.', '2', '8', '.'},
			    {'.', '.', '.', '.', '.', '.', '.', '1', '.'},
			    {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
			};
        //allSolution(0, 0, board1);
    }

    static void oneSolution(int row,int col,char[][] board, boolean[] isSolved)
    {
        if(isSolved[0]==true) return;
        if(row>=board.length)
        {
         	for(char[] r : board)
	        {
	        		System.out.println(Arrays.toString(r));
	        }
	        	System.out.println();
            isSolved[0]=true;
            return;
        } 
        if(col==board[0].length)
        {
        		oneSolution(row+1,0,board,isSolved);
            return;
        }
        if(board[row][col]!='.')
        {
        		oneSolution(row,col+1,board,isSolved);
            return;
        }
        for(int i=1;i<=9;i++)
        {
            board[row][col]=(char)(i+'0');
            if(isSafe(row,col,board))
            {
            		oneSolution(row,col+1,board,isSolved);
                if(isSolved[0])return;
            }
            board[row][col]='.';
        }
        
    }
    
    
    
    static void allSolution(int row,int col,char[][] board)
    {
        if(row>=board.length)
        {
         	for(char[] r : board)
	        {
	        		System.out.println(Arrays.toString(r));
	        }
	        	System.out.println();
            return;
        } 
        if(col==board[0].length)
        {
        		allSolution(row+1,0,board);
            return;
        }
        if(board[row][col]!='.')
        {
        		allSolution(row,col+1,board);
        		return;
        }
        for(int i=1;i<=9;i++)
        {
            board[row][col]=(char)(i+'0');
            if(isSafe(row,col,board))
            {
            		allSolution(row,col+1,board);
            }
            board[row][col]='.';
        }
        
    }
    
    


    static boolean isSafe(int row, int col, char[][] board)
    {
        int sRow = 3*(row/3);
        int sCol = 3*(col/3);
        boolean[] arr = new boolean[10];
        for(int i=sRow;i<sRow+3;i++)
        {
            for(int j=sCol;j<sCol+3;j++)
            {
                if(board[i][j]!='.')
                {
                    int num = (int) board[i][j]-'0';
                    if(arr[num]) return false;
                    arr[num]=true;
                }
            }
        }

        arr = new boolean[10];

        for(int i=0;i<board[0].length;i++)
        {
            if(board[row][i]!='.')
            {
                int num = (int) board[row][i]-'0';
                if(arr[num]) return false;
                arr[num]=true;
            }
            
        }

        arr = new boolean[10];

        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]!='.')
            {
                int num = (int) board[i][col]-'0';
                if(arr[num]) return false;
                arr[num]=true;
            }
        }
        return true;
    }

}
