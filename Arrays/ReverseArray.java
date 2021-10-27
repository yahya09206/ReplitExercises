import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		
		for (int i = nums.length - 1; i > 0; i--) {
			int temp = nums[i];
            nums[i] = nums[nums.length-(i+1)];
            nums[nums.length-(i+1)] = temp;		
		}	
	}
}