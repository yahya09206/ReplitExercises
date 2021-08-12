/*
Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550
*/
import java.util.Scanner;
public class ApartmentLeasing1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Apartments! " + 
							"\nNumber of bedrooms you are interested:");
		int numOfRooms = scan.nextInt();

		if (numOfRooms == 1) {
			System.out.println("One Bedroom Selected" + 
								"\nStarting price: 1100");
		}else if(numOfRooms == 2){
			System.out.println("Two Bedroom Selected" +
								"\nStarting price: 1850");
		}else if(numOfRooms == 3){
			System.out.println("Three Bedroom Selected" + 
								"\nStarting price: 2550");
		}else {
			System.out.println("No such Bedrooms available");
		}
	}
}