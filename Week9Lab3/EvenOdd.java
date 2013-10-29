

public class EvenOdd {
	
	private int m_val;
	
	public EvenOdd(int num){
		m_val = num;
	}//end of constructor
	
	public void setValue(int value){
		
		
		m_val = value;
	}
	
	public void oddeven(){
		System.out.println(m_val);
		if (m_val % 2 == 0)
			System.out.println( "Even");
		
		else
			System.out.println( "Odd");
	}
	
	public void displayMessageOdd()
	{
		System.out.println("Odd");
	}
	
	
	public void displayMessageEven(){
		
		System.out.println("Even");
	}
}
