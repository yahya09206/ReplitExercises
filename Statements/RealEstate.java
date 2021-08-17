/*
wow did i fix this
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
		if (houseType.equalsIgnoreCase("Condo")) {
			propertyPrice += 50000;
		}else if (houseType.equalsIgnoreCase("Townhouse")) {
			propertyPrice += 75000;
		}else if (houseType.equalsIgnoreCase("Single Family Home")){
			propertyPrice += 95000;
		}else {
			System.out.println("Invalid property type!");
		}
		//Prompt for how many bedrooms
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();
		if (numberOfBedrooms > 0) {
			propertyPrice += numberOfBedrooms * 30000;
		}
		//Prompt for backyard
		System.out.println("Do you have a backyard");
		backyard = scan.nextBoolean();
		if (backyard == true) {
			if (houseType.equalsIgnoreCase("condo")) {
				System.out.println("Backyard is not available for condo!");
			}else {
				propertyPrice += 5000;
			}
		}
		//Prompt for garage
		System.out.println("Do you have garage?");
		garage = scan.nextBoolean();
		System.out.println("How many spots?");
		garageSpots = scan.nextInt();
		if (garage == true) {
			if(garageSpots > 10){
				System.out.println("Pardon, it's not public parking!")
			}else {
				propertyPrice += garageSpots * 20000;
			}
		}
	



		//print message
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: " + propertyPrice);
	}
}