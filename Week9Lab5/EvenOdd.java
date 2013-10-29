
import java.util.Random;
import java.util.Scanner;

public class EvenOdd {
	
	private int m_val;
	
	public EvenOdd(){
		Random generator = new Random();
		int num = generator.nextInt(10);
		m_val = num;
	}//end of constructor
	
	public void setValue(int value){
		
		
		m_val = value;
	}
	
	public void oddeven(){
		Scanner input = new Scanner(System.in);
		String userNum;
		 System.out.println("Guess if the Computer chose odd or even.");
		 System.out.println("Enter odd or even then hit enter: ");
		 userNum = input.next();
		
		
		System.out.println(m_val);
		if (m_val % 2 == 0 && userNum.equals("even")){
			System.out.println( "You got it right!");
		}
		
		else if(m_val % 2 !=0  && userNum.equals("odd")){
			System.out.println( "You got it Right");
		}
		
		else{
			System.out.println( "You got Wrong");
		}
			
	}
	
	public void displayMessageOdd()
	{
		System.out.println("Odd");
	}
	
	
	public void displayMessageEven(){
		
		System.out.println("Even");
	}
}
