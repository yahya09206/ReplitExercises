/*
add_to_r is a method that accepts an array and a number.

The method takes the same value of the array but adds the given number into the array at the end. Note: The new number is added which means there is a size difference between the two arrays
*/
import java.util.Scanner;
public class AddToArray {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	}
	public static void add_to_r(int[] r, int n){

		int[] arr1 = new int[r.length + 1];
		for (int i = 0; i < r.length; i++) {
			arr1[i] = r[i];
		}
		arr1[arr1.length - 1];
		System.out.println(Arrays.toString(arr1));
	}
}