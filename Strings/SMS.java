/*
Given a String message in the following format: Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving} assign the value of the sender, phoneNumber, and messageBody variables and print them.
*/
import java.util.Scanner;
public class SMS {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		//String message = scan.nextLine();
		String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

    	String sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
    	String phoneNumber;
    	String messageBody;

    	System.out.println("Sender: " + sender);

	}
}