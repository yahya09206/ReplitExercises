/*
Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

Example:
*/
import java.util.Scanner;
public class FindMidNumber {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNumber = scan.nextInt();
		System.out.println("Enter second number:");
		int secondNumber = scan.nextInt();
		System.out.println("Enter third number:");
		int thirdNumber = scan.nextInt();

		if (firstNumber < secondNumber && secondNumber < thirdNumber) {
			System.out.println("Medium value is: " + secondNumber);
		}else if(thirdNumber > firstNumber && thirdNumber < secondNumber){
			System.out.println("Medium value is:" + thirdNumber);
		}else {
			System.out.println("Medium value is: " + firstNumber);
		}
	}
}