/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
*/
import java.util.Scanner;
public class Email2 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		//String email = scan.next();
		String email = "seattle_washington@gmail.com";
		String firstName = email.substring(0, email.indexOf("_"));

		System.out.println(firstName);
	}
}