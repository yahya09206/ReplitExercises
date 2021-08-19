/*
Write a program that will print a week days according to the day number. Use Switch statement. If an invalid day is entered print: "Not a valid day"
*/
import java.util.Scanner;
public class Weekdays {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = scan.nextInt();

		switch(num){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				
		}

	}
}