import java.util.Scanner;


public class Week6Lab5 {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int userNum;
		int computerNum = 0 + (int) ( Math.random() * 10 );
		int choice;
		
		boolean correct = false, greater;
		boolean play = true;
		
		
		
		do{
		
		
		System.out.print("Guess a number between 1 and 10: ");
		userNum = input.nextInt();
		
		correct = (userNum == computerNum);
		greater = (userNum > computerNum);
		
		
		
		
		
		
		if (correct)
		{
		
			System.out.println("You got it!");
			System.out.print("Want to play again? Enter 1 for yes or 2 for no: ");
			choice = input.nextInt();
			
		}
		
		else if (greater)
		{
			System.out.println("You guessed too high.");
			System.out.print("Want to play again? Enter 1 for yes or 2 for no: ");
			choice = input.nextInt();
		}
		
		else 
		{
			System.out.println("You guessed too low.");
			System.out.print("Want to play again? Enter 1 for yes or 2 for no: ");
			choice = input.nextInt();
		}
		
		switch(choice)
		{
		case 1:
			play = true;
			break;
		case 2:
			play = false;
			break;
		}
		
		
		
		
		} while(play);
		
	
	}
}
		


