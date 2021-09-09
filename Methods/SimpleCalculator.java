/*
Implement the plus method. The return type is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.
*/
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args){
		add();
	}

	public static void add(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	}
}