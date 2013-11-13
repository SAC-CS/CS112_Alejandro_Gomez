//Alejandro Gomez
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private static int randomDice;
	public static int userNum;
	private static int m_val;
	private static int m_bounces;
	private static int m_dices;
	
	public void  TheDiceGame(){
		int sum = 0;
		int counter=0;
		int count = 0;
		int dices=0;
		int bounces = 0;
		int average = 0;
		
		Scanner input = new Scanner(System.in);
		
		
System.out.println("Enter the number of dice to throw: ");
dices = input.nextInt();
System.out.println("Enter Number of bounces: ");
m_bounces = input.nextInt();
System.out.println("What do you think was the average roll?: ");
userNum = input.nextInt();


		while (count < m_bounces) {

			while(counter < dices){
			Random generator = new Random();
			int num = generator.nextInt(6) + 1;
			m_val = num;

			sum = sum + m_val;
			counter++;
			}
			count++;
			}
		average = sum/m_bounces;
		
		if(userNum==average){
			System.out.println("You win!");
		}
			else {
			System.out.println("Wrong it was " + average);
				
			}
		}
	}
	
	
	


