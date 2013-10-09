
import java.util.Arrays;

public class Week7Lab3 {
	public static void main(String[] args){
		int[] aryNums;
		int ave;
		int sum = 0;
		aryNums = new int[6];
		
		aryNums[0] = 123;
		aryNums[1] = 456;
		aryNums[2] = 479;
		aryNums[3] = 135;
		aryNums[4] = 246;
		aryNums[5] = 135;
		
		Arrays.sort(aryNums);
		
		int i;
		for(i=0; i < aryNums.length; i++){
			
			
			System.out.println("Number : " + aryNums [i]);
			
			
			
		}
		for(i=0; i < aryNums.length; i++){
			
			
			
			sum = sum + aryNums [i];	
		}
		
		ave = sum/6;
		
		System.out.println("Average: " + ave);
	}

}
