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
	
	public int Throw(int bounces){
		int sum = 0;
		int count = 0;
		
		while( count < bounces){
		
		Random generator = new Random();
        int num = generator.nextInt(6) + 1;
        m_val = num;
        
        sum = sum + m_val;
        count++;
		}
        
        
		
		
		return (sum/bounces);
		
	}
	
	public int Value(){
		return m_val;
	}
	

}
