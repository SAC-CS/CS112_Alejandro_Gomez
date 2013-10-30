import java.util.Random;
import java.util.Scanner;


public class Dice {
	
	private int m_val;
	
	
	public void diceGame(){//random generator class
		int userNum;
		String userChoice = "yes";
		int userWins = 0, compWins = 0;
		int percentWins, rounds = 1, gameCounter = 0;
		int i = 0;
		
		int compRolls [] = new int [100];
		int userRolls [] = new int [100];
		String winner [] = new String [100];
		
		 Random generator = new Random();
		 Scanner input = new Scanner(System.in);
		 
         
         
         while(userChoice.equals("yes")){
        	 int rand = generator.nextInt(6) + 1;
        	 
        	 m_val = rand;
        	 
        	 System.out.println("Enter an integer between 1 and 6: ");
        	 userNum = input.nextInt();
        	 
        	 if(userNum == m_val){
        		 System.out.println("Correct! You Won!");
        		 winner [i] = "User";
        		 userWins++; 
        	 }
        	 else{
        		 System.out.println("Wrong! You Lost!");
        		 winner [i] = "Computer";
        		 compWins++;
        		 
        	 }
        	 
        	 userRolls[i] = userNum;
        	 compRolls[i] = m_val;
        	 gameCounter++;
        	 i++;
        	 
        	 System.out.println("Do you want to play again?");
        	 System.out.println("Enter yes or no: ");
        	 userChoice = input.next();
        	 
         }
        
         System.out.println(" ");
         if(userWins == compWins){
        	 
        	   System.out.println("It's a tie.");
        	   System.out.println("You each won " + userWins + " times.");
         }
        else if(userWins > compWins){
        	
        	percentWins = (userWins/gameCounter)* 100;
        	System.out.println("You won the most games!");
     	    System.out.println("You won " + userWins + " times.");
     	    System.out.println("The Computer won " + compWins + " times.");
     	    System.out.println("You won " + percentWins + "% of the games.");

     	    
        	   }
        else if(userWins < compWins){
        	percentWins = (compWins/gameCounter)* 100;
        	System.out.println("You lost. The Computer won the most games!");
     	    System.out.println("The computer won " + compWins + " times.");
     	    System.out.println("You won " + userWins + " times.");
     	    System.out.println("The Computer won " + percentWins + "% of the games.");
        }
         
         System.out.println(" ");
         System.out.println("**Game Results**");
         System.out.println(" ");
        	 
         for(i=0; i < gameCounter; i++)
         {
                
             System.out.println("Game "+ rounds);
             System.out.println("User rolled: " + userRolls [i]);
             System.out.println("Computer rolled: " +compRolls [i]);
             System.out.println("Game Winner: " + winner[i]);
             System.out.println("\t\t");
             
             rounds++;
            
         }
         }
         
	}
	
	

	


