/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.`
*/
import java.util.Scanner;
public class PrintUniqueNums {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	}

	public static void PrintUniqueNumbers(int[] nums){

		
		int count = 0;
		for (int i = 0, j = 0; i <= nums.length; i++, j++) {
			if (nums[i] == nums[j]) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(nums[i])
		}
	}
}