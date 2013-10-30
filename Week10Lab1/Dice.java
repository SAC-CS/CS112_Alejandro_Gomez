import java.util.Random;
import java.util.Scanner;


public class Dice {
	
	private int m_val;
	
	public int Throw(){
		Random generator = new Random();
        int num = generator.nextInt(6) + 1;
        m_val = num;
        
        return m_val;
	}
	
	public int value(){
		return m_val;
	}
	

}
