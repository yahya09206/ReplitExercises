/*
A console menu is basically a text menu. After it is outputted to the console a user input is captured. Then the program decides what to do according to the user input (what the user selected).

This is done using separate if statements(without else) or branched if statements.

Uur console menu has 3 items called "options"
*/
import java.util.Scanner;

public class ConsoleMenu {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("---------------");
	    System.out.println("select an option:");
	    System.out.println("1) option 1");
	    System.out.println("2) option 2");
	    System.out.println("3) option 3");
	    System.out.println("---------------");
	    
	    int choice = s.nextInt();

	    if (choice == 1) {
	    	System.out.println("user selected 1");
	    }
	    if (choice == 2) {
	    	System.out.println("user selected 2");
	    }
	    if (choice == 2) {
	    	System.out.println("user selected 3");
	    }
	}
}