/*
Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
*/
import java.util.*;
public class FrontPiece {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}

		if (num.length < 2) {
			System.out.println(Arrays.toString(num));
		}else {
      		int[] num2 = new int[2];
      		num2[0] = num[0];
      		num2[1] = num[1];
      		System.out.println(Arrays.toString(num2));
    	}

	}
}