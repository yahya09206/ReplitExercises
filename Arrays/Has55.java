/*
Given an array nums, print true if the array contains a 5 next to a 5 anywhere in the array. If no consecutive 5s or no 5s are detected in your code then print false.
*/
import java.util.Arrays;
public class Has55 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
    	int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 5 && nums[i+1] == 5) {
    			System.out.println("true");
    		}else {
    			false;
    		}
    	}
	}
}