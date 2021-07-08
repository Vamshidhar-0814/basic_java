package Package1;

import java.util.*;
public class Squarelotron {

	int[][] squarelotron = new int[8][8];
	int[][] squarelotron1 = new int[8][8];
	int size;

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Squarelotron");
		System.out.println("In this program we will perform \n a. Upside-Down Flip \n b. Main diagonal Flip \n c. Right angle rotations\n");
		System.out.println("->The order of the squarelotron must be between 1 and 8");
		System.out.println("-> To rotate the squarelotron in anti-clockwise direction, enter negative integers when prompted");
		System.out.println("Enter the order of the matrix");
		int n = sc.nextInt();

		Squarelotron obj = new Squarelotron();
		System.out.println();
		System.out.println("The Original Squarelotron");
		System.out.println();
		obj.Squarelotron(n);
		System.out.println();
		System.out.println("The Squarelotron after Upside-Down Flip");
		System.out.println();
		obj.upsideDownFlip(n);
		System.out.println();
		System.out.println("The Squarelotron after Main-Diagonal Flip");
		System.out.println();
		obj.mainDiagonalFlip(n);

		System.out.println();
		System.out.println("Enter the number of turns");
		int turns = sc.nextInt();

		obj.rotateRight(turns);
	}
	public void Squarelotron(int n)
	{
		size = n;
		int c = 1;
		for(int i=0; i<=n-1;i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				squarelotron[i][j] = c;
				squarelotron1[i][j] = c;
				c++;
				System.out.print(squarelotron[i][j] + "\t");

			}
			System.out.println("");
		}

	}
	public void upsideDownFlip(int ring)
	{

		int k,temp;
		for(int i = 0; i<=size-1; i++)
		{ 
			k = (size-1) - i;
			for(int j = 0; j<=size-1; j++) {
				temp = squarelotron[i][j];
				squarelotron1[k][j] = temp;

			}
		}

		for(int i=0; i<=size-1; i++)
		{
			for(int j=0; j<=size-1; j++)
			{
				System.out.print(squarelotron1[i][j] + "\t");
			}
			System.out.println("");

		}
	}
	public void mainDiagonalFlip(int ring)
	{
		int temp;
		for(int i = 0; i<=size-1; i++)
		{ 
			for(int j = 0; j<=size-1; j++) {
				temp = squarelotron[i][j];
				squarelotron1[j][i] = temp;

			}
		}

		for(int i=0; i<=size-1; i++)
		{
			for(int j=0; j<=size-1; j++)
			{
				System.out.print(squarelotron1[i][j] + "\t");
			}
			System.out.println("");

		}
	}
	public void rotateRight(int numberOfTurns)
	{
		if(numberOfTurns>0)
		{

			for(int n = 0; n<=numberOfTurns-1; n++)
			{


				int temp,k;
				for(int i = 0; i<=size-1; i++)
				{	
					k = (size-1)-i;
					for(int j = 0; j<=size-1; j++) {
						temp = squarelotron[i][j];
						squarelotron1[j][k] = temp;

					}

				}
				for(int i = 0; i<=size-1; i++)
				{
					for(int j=0; j<=size-1; j++)
					{
						squarelotron[i][j] = squarelotron1[i][j];
					}
				}


			}
		}
		else
		{
			for(int n = numberOfTurns; n<0; n++)
			{


				int temp,k;
				for(int i = 0; i<=size-1; i++)
				{	
					
					for(int j = 0; j<=size-1; j++) {
						k = (size-1)-j;
						temp = squarelotron[i][j];
						squarelotron1[k][i] = temp;

					}

				}
				for(int i = 0; i<=size-1; i++)
				{
					for(int j=0; j<=size-1; j++)
					{
						squarelotron[i][j] = squarelotron1[i][j];
					}
				}


			}
			
		}
		for(int i=0; i<=size-1; i++)
		{
			for(int j=0; j<=size-1; j++)
			{

				System.out.print(squarelotron1[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
