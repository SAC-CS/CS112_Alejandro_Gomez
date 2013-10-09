import java.util.Scanner;
import java.util.Random;

public class Week7Lab1 {public static void main(String args[])	{
	
	Scanner input = new Scanner(System.in);		
	Random choice = new Random();
	
	int userChoice;
	int computerChoice;
	int games, exactGames;
	int counter = 0;
	int winnings = 0;
	int compWinnings = 0;
	
	System.out.print("How many games would you like to play?: ");
	games = input.nextInt();
	
	if (games%2 == 0){
		exactGames = (games / 2) +1;
	}
	
	else{
		exactGames = games / 2 + 1;
	}
	
	System.out.printf("First to %d victories wins the Match\n", exactGames);
	
	do{
		computerChoice = choice.nextInt(3) + 1;
	System.out.print("Type 1 for Rock, 2 for Paper, or 3 for Scissors then hit enter: ");
	userChoice = input.nextInt();
	
	if (userChoice == computerChoice){			
		System.out.println("Its's a draw");
		}
	else if (userChoice == 1) 
	{			
		if (userChoice == 1 && computerChoice == 2)	{
			System.out.println("Computer chose Paper. You Lose.");
			compWinnings++;
			}			
		else{				
			System.out.println("Computer chose Scissors. You Win!");
			winnings++;
			}		
	}
	else if (userChoice == 2)	
	{			
		if (userChoice == 2 && computerChoice == 3)	
		{				
			System.out.println("Computer chose Scissors. You Lose.");
			compWinnings++;
		}			
		else	
		{				
			System.out.println("Computer chose Rock. You Win!");
			winnings++;
		}			
	}
	else if (userChoice == 3)		
	{			
		if (userChoice == 3 && computerChoice == 1)	
		{		
			System.out.println("Computer chose Rock. You Lose.");
			compWinnings++;
		}		
		else		
		{			
			System.out.println("Computer chose Paper. You Win!");
			winnings++;
		}		
	}
	
	counter++;
	} while(winnings <= exactGames && compWinnings <= exactGames && counter != exactGames);
	
	if (winnings > compWinnings){
		System.out.println("You Won the Match!");
	}
	else if(compWinnings > winnings) {
		System.out.println("You lost! The Computer Won the Match.");
	}
	else if(winnings == compWinnings){
		System.out.println("The Match ended in a Tie.");
	}
		
	
System.out.printf("You won %d times and the computer won %d times.\n" , winnings, compWinnings);
	
											}

}
