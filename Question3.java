package question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution3 {
	public static void main(String[] args){
		for (int i=1;i<=5;i++){
			char[] dots=new char[5-i];
			Arrays.fill(dots, '.'); //fill char array with periods
			char[] nums=new char[i];
			Arrays.fill(nums, Integer.toString(i).charAt(0));//fill char array with numbers
			System.out.println(String.valueOf(dots)+String.valueOf(nums));
		}
	}
}
/*
	How would you rewrite this for the nth number instead of ending at 5?
	
	 One would need to substitute "n" wherever there is 5 written in the 
	 code, so the loop would be controlled by the nth number instead of
	 5. There would also need to be a check to make sure the "nth" number
	 is no more than 9, for it is no longer a digit then. If user
	 is providing the nth number, one would need to make n equal to the 
	 first argument passed into the code. 
*/

	

