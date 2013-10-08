import java.util.Scanner;


public class Week6Lab1 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int userNum;
		int computerNum = 0 + (int) ( Math.random() * 10 );
		
		boolean correct = false, greater;
		
		System.out.print("Guess a number between 1 and 10: ");
		userNum = input.nextInt();
		
		correct = (userNum == computerNum);
		greater = (userNum > computerNum);
		
		
		if (correct)
		{
		
			System.out.print("You got it!");
		}
		
		else if (greater)
		{
			System.out.print("You guessed too high.");
		}
		
		else 
		{
			System.out.print("You guessed too low.");
		}
		
	}


}
