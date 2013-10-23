

public class EvenOdd {
	
	private int m_val;
	
	public void setValue(int value){
		
		
		m_val = value;
	}
	
	public String oddeven(){
		
		if (m_val%2 == 0){
			return "even";
		}
		else
			return "odd";
	}
	
	public void displayMessageOdd()
	{
		System.out.println("Odd");
	}
	
	
	public void displayMessageEven(){
		
		System.out.println("Even");
	}
}
