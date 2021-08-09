/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.
*/
import java.util.Scanner;
public class PatientInformation {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//String variables
		String firstName = scan.next();
		String lastName = scan.next();
		String fullName = firstName + lastName;
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
		String address = street + ", " + city + ", " + state + " " + zipCode;
	}
}