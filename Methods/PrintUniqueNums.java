/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.`
*/
import java.util.Scanner;
public class PrintUniqueNums {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	}

	public static void PrintUniqueNumbers(int[] nums){
	
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
			}
		}
	}
}