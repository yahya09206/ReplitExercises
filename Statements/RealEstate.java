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

		System.out.println("How close is metro station?");
		metroAccessibility = scan.nextFloat();

		System.out.println("How close is highway?");
		highwayAccessibility = scan.nextFloat();

		System.out.println("What's the rating of nearest school?");
		schoolScore = scan.nextFloat();

		System.out.println("Does any of your family members smoke?");
		smoking = scan.nextBoolean();


		if (houseType.equalsIgnoreCase("condo")) {
			propertyPrice += 50000;
			if (numberOfBedrooms == 1) {
				propertyPrice += 30000;
			}else if(numberOfBedrooms == 2){
				propertyPrice += 60000;
			}else if(numberOfBedrooms == 3){
				propertyPrice += 90000;
			}
		}
		//print message
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: " + propertyPrice);
	}
}