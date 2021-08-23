/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.
*/
import java.util.Scanner;
public class Email1 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		//String email = scan.next();
		String email = "seattle_washington@gmail.com";

		if (email.contains("_")) {
			String firstHalf = email.substring(0,email.indexOf("_"));
			String secondHalf = email.substring((email.indexOf("_") + 1), email.indexOf("@"));
			System.out.println(secondHalf + "_" + firstHalf + "@gmail.com");
		}else {
			System.out.println(email);
		}

	}
}