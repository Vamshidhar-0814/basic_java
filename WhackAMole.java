package Package1;

import java.util.*;
public class WhackAMole {
	
	int score = 0;
	int molesLeft = 10;
	int attemptsLeft = 50;
	char grid[][] = new char[10][10];
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Whack-A-Mole");
		System.out.println();
		System.out.println("\nIn this game you will have a maximum of 50 attempts to whack all the moles."
				+ "\nAt each attempt, you can enter the coordinates of where you would like to whack (x,y)"
				+ "\nThe game will end when you have uncovered all the moles or run out of attempts."
				+ "\nIf you wish to quit the game at any point you can enter -1,-1 when prompted for coordinates."
				+ "\nEnjoy the game.");
		WhackAMole obj = new WhackAMole();
		obj.create();
		obj.printGridtoUser();
		
		System.out.println("Enter co-ordinates:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ch = 1;
		while(ch!=0)
		{
			obj.whack(x,y);
			obj.printGridtoUser();
			System.out.print("");
			
			System.out.println("Enter co-ordinates:");
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == -1 || y == -1 )
				ch = 0;
		}	
		
		System.out.println("GAME OVER");
		obj.printGrid();
			
		
	}
	
	void whack(int x,int y)
	{
		if(grid[x][y] == 'M')
		{
			grid[x][y] = 'W';
			molesLeft--;
			attemptsLeft--;
			score++;	
		}
		else
		{
			grid[x][y] = 'W';
			attemptsLeft--;
		}
	}
	
	void printGrid()
	{
		for(int i=0; i<=9; i++)
		{
			for(int j=0; j<=9; j++)
			{
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Score: " + score);
		System.out.println("Attempts Left = " + attemptsLeft);
		System.out.println("Moles Left = " + molesLeft);
	}
	
	void printGridtoUser()
	{
			for(int i=0; i<=9; i++)
			{
				
				for(int j=0; j<=9; j++)
				{
					if(grid[i][j]!= 'W')
					System.out.print('*' + " ");
					else
						System.out.print(grid[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Score: " + score);
			System.out.println("Attempts Left = " + attemptsLeft);
			System.out.println("Moles Left = " + molesLeft);
	}
	void create()
	{
		for(int i=0; i<=9; i++)
		{
			for(int j=0; j<=9;j++)
			{
				if(i==2 && j==5)
				{
					grid[i][j]= 'M';
				}
				else if(i==3 && j==4)
				{
					grid[i][j]= 'M';
				}
				else if(i==4 && j==4)
				{
					grid[i][j]= 'M';
				}
				else if(i==6 && j==8)
				{
					grid[i][j]= 'M';
				}
				else if(i==9 && j==1)
				{
					grid[i][j]= 'M';
				}
				else if(i==9 && j==9)
				{
					grid[i][j]= 'M';
				}
				else if(i==7 && j==7)
				{
					grid[i][j]= 'M';
				}
				else if(i==8 && j==3)
				{
					grid[i][j]= 'M';
				}
				else
				{
					grid[i][j]= '*';
				}
			}
			
		}
		grid[0][2] = 'M';
		grid[1][0] = 'M';
		
	}
	
}

