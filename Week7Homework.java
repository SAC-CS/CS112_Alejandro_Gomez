import java.util.Scanner;
import java.util.Random;

public class Week7Homework 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Random number = new Random();
		
		int userMoves [] = new int [100];
		int compMoves [] = new int [100];
		String winner [] = new String [100];
		
		int userMoveNo = 0;
		int compMoveNo = 0;
		int gameWinner = 0;
		
		int i = 0;
		int rounds = 1;
		int gameCount = 0;
		int userNum;
		int computerNum = 1 + number.nextInt(10);
	
		String userChoice;
		
		do{
			
		System.out.print("Guess a number between 1 and 10: ");
		userNum = input.nextInt();
		
		if (userNum < computerNum )
			{
		
			System.out.println("You guessed too low!");
			System.out.print("Do you want to play again? Press Y for yes or N for no: ");
			userChoice = input.next();
			winner [gameWinner] = "Computer";
			
			
			}
		
		else if (userNum > computerNum )
			{
			System.out.println("You guessed too high.");
			System.out.print("Do you want to play again? Press Y for yes or N for no: ");
			userChoice = input.next();
			winner [gameWinner] = "Computer";
			
			}
		
		else
			{
			System.out.println("You guessed correct.");
			System.out.print("Do you want to play again? Press Y for yes or N for no: ");
			userChoice = input.next();
			winner [gameWinner] = "User";
			
			}
		
		userMoves [userMoveNo] = userNum;
		compMoves [compMoveNo] = computerNum;
		
		userMoveNo++;
		compMoveNo++;
		gameCount++;
		gameWinner++;
		
		}
		while (userChoice.equals("Y"));
		
		System.out.println(" ");
		
		for(i=0; i < gameCount; i++){
			
			System.out.println("Game "+ rounds);
			System.out.println("User chose: " + userMoves [i]);
			System.out.println("Computer chose: " +compMoves [i]);
			System.out.println("Game Winner: " + winner[i]);
			System.out.println(" ");
			
			rounds++;
		}
		
		System.out.println("Good Bye.");
	}
}
