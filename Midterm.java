import java.util.Scanner;
import java.util.Random;

public class Midterm {
	
	public static void main(String args[]){
		
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
         int computerNum;
         int compWins = 0;
         int userWins = 0;
         
         String userChoice;
         
         do{
        	 computerNum = ((1 + number.nextInt(10))%2);
        	 //System.out.println(computerNum);
        	 
        	 System.out.println("Guess if the computer chose an even or odd number.");
        	 System.out.println("Press 1 for odd or 2 for even.");
        	 userNum = input.nextInt();
        	 
        	 
        	 if (userNum == 1 && computerNum == 0 ){
        		 System.out.println("Wrong! It was even");
        		 compWins++;
        		 winner [gameWinner] = "Computer";
        	 }
        	 else if (userNum == 2 && computerNum != 0){
        		 System.out.println("Wrong! It was odd");
        		 compWins++;
        		 winner [gameWinner] = "Computer";
        	 }
        	 else{
        		 System.out.println("You guessed correct!");
        		 userWins++;
        		 winner [gameWinner] = "User";
        	 }
        	 compMoves [compMoveNo] = computerNum;
        	 userMoves [userMoveNo] = userNum;
        	 
        	 userMoveNo++;
             compMoveNo++;
        	 gameCount++;
        	 gameWinner++;
        	 
        	 System.out.println("Do you want to play again? Press Y for yes or N for no: ");
             userChoice = input.next();
             
             
             
         }while (userChoice.equals("Y"));
         
         System.out.println("You Played " + gameCount + " times.");
         
         if (userWins > compWins){
        	 
        	 System.out.println("You won the most games! You win!");
        	 System.out.println("You won " + userWins + " times.");
        	 System.out.println("The Computer won " + compWins + " times.");
         }
         else if (userWins < compWins){
        	 System.out.println("The Computer won the most games. You lose.");
        	 System.out.println("You won " + userWins + " times.");
        	 System.out.println("The Computer won " + compWins + " times.");
         }
         
         else{
        	 System.out.println("It's a draw. You both won the same amount of games.");
        	 System.out.println("You won " + userWins + " times.");
        	 System.out.println("The Computer won " + compWins + " times.");
         }
         
         System.out.println(" ");
         
         System.out.println("Here is how each round went: ");
         
         for(i=0; i < gameCount; i++){
             
             System.out.println("Game "+ rounds);
             System.out.println("User chose: " + userMoves [i]);
             System.out.println("Computer chose: " +compMoves [i]);
             System.out.println("Game Winner: " + winner[i]);
             System.out.println(" ");
             
             rounds++;
     }
         
         
         
         
	}

}
