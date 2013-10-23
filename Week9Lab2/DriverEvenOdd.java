import java.util.Scanner;

public class DriverEvenOdd {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		
		EvenOdd myEvenOdd = new EvenOdd();
		
		System.out.println("Enter an integer: ");
		int value = input.nextInt();
		myEvenOdd.setValue(value); 
		System.out.println( myEvenOdd.oddeven() );
		 
	}
}
