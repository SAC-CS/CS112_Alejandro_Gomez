import java.util.Scanner;
import java.util.Random;

public class Week5Homework 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Random choice = new Random();
		
		int userChoice;
		int computerChoice = choice.nextInt(3) + 1;
		
		System.out.print("Type 1 for Rock, 2 for Paper, or 3 for Scissors then hit enter: ");
		userChoice = input.nextInt();
		
		if (userChoice == computerChoice)
		{
			System.out.print("Its's a draw");
		}
		
		else if (userChoice == 1)
		{
			if (userChoice == 1 && computerChoice == 2)
			{
				System.out.print("Computer chose Paper. You Lose.");
			}
			else
			{
				System.out.print("Computer chose Scissors. You Win!");
			}	
		}
		else if (userChoice == 2)
		{
			if (userChoice == 2 && computerChoice == 3)
			{
				System.out.print("Computer chose Scissors. You Lose.");
			}
			else
			{
				System.out.print("Computer chose Rock. You Win!");
			}	
		}
		else if (userChoice == 3)
		{
			if (userChoice == 3 && computerChoice == 1)
			{
				System.out.print("Computer chose Rock. You Lose.");
			}
			else
			{
				System.out.print("Computer chose Paper. You Win!");
			}	
		}
		
	}
}

