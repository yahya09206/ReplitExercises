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

		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();
		numberOfBedrooms *= 30000;

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
			if(backyard.equalsIgnoreCase("true")){
				System.out.println("Backyard is not available for condo!");
				propertyPrice = propertyPrice;
			}else {
				propertyPrice += 50000;
			}
			if (garage.equalsIgnoreCase("true")) {
				if (garageSpots > 10) {
					System.out.println("Pardon, it's not public parking!");
					propertyPrice = propertyPrice;
				}else {
					propertyPrice += garageSpots * 20000;

				}
			}
			if (metroAccessibility < 1) {
				propertyPrice += 10000;
			}else if (metroAccessibility > 1 && metroAccessibility <= 3){
				propertyPrice += 5000;
			}
			if (highwayAccessibility < 1) {
				propertyPrice += 15000;
			}else if (highwayAccessibility >= 1 && highwayAccessibility <= 5){
				propertyPrice += 8000;
			}else if(highwayAccessibility >= 5 && highwayAccessibility <= 20){
				propertyPrice += 4000;
			}
		}
		//print message
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: " + propertyPrice);
	}
}