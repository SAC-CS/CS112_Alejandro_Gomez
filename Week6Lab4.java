import java.util.Scanner;


public class Week6Lab4 {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int userNum;
		int computerNum = 0 + (int) ( Math.random() * 10 );
		String choice;
		
		boolean correct = false, greater;
		boolean play = true;
		
		
		
		
		while(play){
		
		System.out.print("Guess a number between 1 and 10: ");
		userNum = input.nextInt();
		
		correct = (userNum == computerNum);
		greater = (userNum > computerNum);
		
		
		
		
		if (correct)
		{
		
			System.out.println("You got it!");
			System.out.print("Want to play again? Enter Y for yes or N for no: ");
			choice = input.next();
			
		}
		
		else if (greater)
		{
			System.out.println("You guessed too high.");
			System.out.print("Want to play again? Enter Y for yes or N for no: ");
			choice = input.next();
		}
		
		else 
		{
			System.out.println("You guessed too low.");
			System.out.print("Want to play again? Enter Y for yes or N for no: ");
			choice = input.next();
		}
		
		
		if (choice.equals("N"))
		{
			play = false;
		}
				}
		
	}
			
}


