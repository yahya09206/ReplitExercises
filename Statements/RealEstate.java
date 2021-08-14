/*

*/
import java.util.Scanner;
public class RealEstate {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;

		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("Enter your property type:");
		houseType = scan.nextLine();

		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();

		System.out.println("Do you have a backyard?");
		backyard = scan.nextBoolean();

		System.out.println("Do you have garage?");
		garage = nextBoolean();
		System.out.println("How many spots?")
		garageSpots = scan.nextInt();




	}
}