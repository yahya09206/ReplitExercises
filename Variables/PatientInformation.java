/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.
*/
import java.util.Scanner;
public class PatientInformation {
	public static void main(String[] args){
		 //Declare scanner object
		Scanner scan = new Scanner(System.in);

		//Welcome message
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");


		//String variables
		System.out.println("Enter your first name");
		String firstName = scan.next();
		System.out.println("Enter your last name");
		String lastName = scan.next();
		System.out.println("Enter your email");
		String email = scan.next();
		System.out.println("Enter your street");
    	scan.nextLine();
		String street = scan.nextLine();
		System.out.println("Enter your city");
		String city = scan.next();
		System.out.println("Enter your state");
		String state = scan.next();

		//numeric variables
		System.out.println("Enter your zip code");
		int zipCode = scan.nextInt();
		System.out.println("Enter your work phone number");
		long workPhoneNumber = scan.nextLong();
		System.out.println("Enter your personal phone number");
		long personalPhoneNumber = scan.nextLong();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Enter your height");
		double height = scan.nextDouble();
		System.out.println("Enter your weight");
		double weight = scan.nextDouble();
		System.out.println("Are you married?");
		boolean isMarried = scan.nextBoolean();
		//close scanner
		scan.close();

		//Concatenations
		String fullName = lastName + ", " + firstName;
		String address = street + ", " + city + ", " + state + " " + zipCode;
		String contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;

		System.out.println("Patient personal information");
	    System.out.println("Full name: " + fullName);
	    System.out.println("Address: " + address);
	    System.out.println("Contacts: " + contacts);
	    System.out.println("Age: " + age);
	    System.out.println("Height: " + height);
	    System.out.println("Weight: " + weight + " pounds");
	    System.out.println("Married?: " + isMarried);
	}
}