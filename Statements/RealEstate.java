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
	



		//print message
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: " + propertyPrice);
	}
}