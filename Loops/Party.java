/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guests.
If yes - take the next guest input
If not - finish the program and print list of the guests.
*/
import java.util.Scanner;
public class Party {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String list = " ";
    	String countinue = "yes";

		while(countinue.equalsIgnoreCase("yes")){
				System.out.println("Please enter guest name:");
				String name = scan.next();
				System.out.println("Do you want to enter new guest name:");
				countinue = scan.next();
        		list += name + ", ";
			if (countinue.equalsIgnoreCase("no")) {
				System.out.println("Guest's list:" + list.substring(0, list.length() - 2));
			}
		}
	}
}