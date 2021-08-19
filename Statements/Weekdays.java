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
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Not a valid day");
				break;
		}

	}
}