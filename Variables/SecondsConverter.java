/*
Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:

"Enter seconds:"

Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.

Assign values to the hours, minutes, seconds variables

Display the result.

Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
*/
import java.util.Scanner;

public class SecondsConverter {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int inputSeconds = scan.nextInt();
		int hours = scan.nextInt();
		int minutes = scan.nextInt();
		int seconds = scan.nextInt();
	}
}