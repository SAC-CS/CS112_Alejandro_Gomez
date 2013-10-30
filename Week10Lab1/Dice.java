import java.util.Random;
import java.util.Scanner;


public class Dice {
	
	private int m_val;
	
	public void Throw(){
		Random generator = new Random();
        int num = generator.nextInt(6) + 1;
        m_val = num;
        
        System.out.println(m_val);
	}
	
	public void value(){
		System.out.println(m_val);
	}
	

}
