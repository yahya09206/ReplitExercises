/*
In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.
*/
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = 5;
		long result = 1L;

		for (int i = n; i >= 1; i--) {
			result *= i;
		}

		System.out.println(result);
	}
}