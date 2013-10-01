import java.util.Scanner;


public class Week5Lab7 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int userNum;
		int computerNum = 0 + (int) ( Math.random() * 10 );
	
		String userChoice;
		
		do{
			
		System.out.print("Guess a number between 1 and 10: ");
		userNum = input.nextInt();
		
		if (userNum < computerNum )
			{
		
			System.out.println("You guessed too low!");
			System.out.print("Do you want to play again? Press Y for yes or N for no: ");
			userChoice = input.next();
			
			}
		
		else if (userNum > computerNum )
			{
			System.out.println("You guessed too high.");
			System.out.print("Do you want to play again? Press Y for yes or N for no: ");
			userChoice = input.next();
			
			}
		
		else
			{
			System.out.println("You guessed correct.");
			System.out.print("Do you want to play again? Press Y for yes or N for no: ");
			userChoice = input.next();
			
			}
		
		
		}
		while (userChoice.equals("Y"));
		
		System.out.println("Good Bye.");
	}
}
