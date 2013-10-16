import java.util.Scanner;

public class MidtermBonus {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int m = 1;
		int f = 1;
		int n;
		
		System.out.println("Input a number equal to or greater than one.");
		n = input.nextInt();
		

		
		while (m != n){
			
			f = f*m;
			m = m +1;
			
		}
		
		System.out.println(f);
		
		
	}
}
