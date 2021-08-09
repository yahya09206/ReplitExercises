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
		System.out.println("Welcome to the patient portal! ");
		System.out.println("Please enter your personal information ");


		//String variables
		System.out.println("Enter your first name ");
		String firstName = scan.next();
		System.out.println("Enter your last name ");
		String lastName = scan.next();
		System.out.println("Enter your email ");
		String email = scan.next();
		String street = scan.nextLine();
		String state = scan.next();
		String city = scan.next();

		//numeric variables
		int age = scan.nextInt();
		int zipCode = scan.nextInt();
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		boolean isMarried = scan.nextBoolean();
		long workPhoneNumber = scan.nextLong();
		long personalPhoneNumber = scan.nextLong();

		//Concatenation
		String fullName = "Patient personal information: " + firstName + ", " + lastName;
		String address = "Address: " + street + ", " + city + ", " + state + " " + zipCode;
		String contacts = "Contacts: work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber ", " + "email:" + email;
	}
}