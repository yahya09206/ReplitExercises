/*
Write a program that will print out month names by receiving a number. Use Switch Statement. If an invalid month number is entered print "Invalid month number"
*/
import java.util.Scanner;
public class Calendar {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number");
     	int monthNum = scan.nextInt();


     	switch(monthNum){
     		case 1:
     			System.out.println("January");
     			break;
     		case 2:
     			System.out.println("February");
     			break;
     		case 3:
     			System.out.println("March");
     			break;
     	}

	}
}