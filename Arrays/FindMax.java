/*
Given an array num, get the max number in the array and print it out to the console.
*/
import java.util.*;
public class FindMax {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
    	int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    	// DO NOT TOUCH ABOVE
    	//TODO: Write your code below.
    	int max = nums[0];
    	for (int i = 0; i < nums.length; i++) {
    		int each = nums[i];
    		if (each > nums[i]) {
    			max = each;
    		}
    	}
    	System.out.println(max);
	}
}