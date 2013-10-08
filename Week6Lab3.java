import java.util.Scanner;


public class Week6Lab3 {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int userNum;
		int computerNum = 0 + (int) ( Math.random() * 10 );
		int counter = 1;
		
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
		}
		
		else if (greater)
		{
			System.out.println("You guessed too high.");
		}
		
		else 
		{
			System.out.println("You guessed too low.");
		}
		counter++;
		play = (counter < 4);
	}
			
				}
}
