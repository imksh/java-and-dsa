package ticTacToe;

import java.util.Scanner;

public class TicTacToe 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[3][3];
		char player = 'X';
		boolean gameOver = false;
		int count=0;
		for(int row=0;row<board.length;row++)
		{
			for(int col=0;col<board[row].length;col++)
			{
				board[row][col]=' ';
			}
		}
		
		while(!gameOver)
		{
			display(board);
			System.out.println("Player : " + player + " Enter: ");
			int row = sc.nextInt();
			int col = sc.nextInt();
			if(board[row][col]==' ')
			{
				board[row][col]=player;
				count++;
				gameOver=haswon(board, player);
				if(count==board.length*board.length)
				{
					System.out.println("Game Drawn");
					display(board);
					gameOver=true;
					break;
				}
				if(gameOver)
				{
					System.out.println("Player " + player + " has WON!!!");
					display(board);
				}
				if(player=='X')
				{
					player='O';
				}else 
				{
					player='X';
				}
			}else 
			{
				System.out.println("Wrong Input, Try Again..");
				
			}
		}
		sc.close();
	}
	
	
	static boolean haswon(char[][] board,char player)
	{
		for(int i=0;i<board.length;i++)
		{
			if(board[i][0]==player && board[i][1]==player && board[i][2]==player)
			{
				return true;
			}
		}
		
		for(int i=0;i<board.length;i++)
		{
			if(board[0][i]==player && board[1][i]==player && board[2][i]==player)
			{
				return true;
			}
		}
		
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player)
		{
			return true;
		}
		if(board[2][0]==player && board[1][1]==player && board[0][2]==player)
		{
			return true;
		}
		return false;
	}

	static void display(char[][] board)
	{
		for(int i=0;i<board.length;i++)
		{
			System.out.print(" ---");
		}
		System.out.println();
		for(int row=0;row<board.length;row++)
		{
			System.out.print("| ");
			for(int col=0;col<board[row].length;col++)
			{
				System.out.print(board[row][col] + " | ");
				
			}
			System.out.println();
			for(int i=0;i<board.length;i++)
			{
				System.out.print(" ---");
			}
			System.out.println();
		}
	}
	
	

}
