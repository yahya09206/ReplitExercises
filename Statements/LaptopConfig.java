/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.

If screen size is equals to 13.3, add $200 to the laptop price.
If screen size is equals to 15.0 - add $300 to the laptop price.
If screen size is equals to 17.3 - add $400 to the laptop price.
Then ask user for CPU type.

If CPU type equals to i3, add $150 to the laptop price.
If CPU type equals to i5, add $250 to the laptop price.
If CPU type equals to i7, add $350 to the laptop price.
Then ask user for RAM size.

Add $50 for every 4GB of ram to the laptop price.
Then, ask user for storage type. There are 2 options: SSD and HDD.

If it's HDD - add $50 to the laptop price for every 500gb.
If it's SSD - add $100 to the laptop price for every 500GB.
Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.

Add $100 if it's FULLHD screen
Add $200 if it's 4K screen.
*/
import java.util.Scanner;
public class LaptopConfig {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int raM, memorySize;
		double screenSize = 0.0, price = 0.0;
		String cpU = "", storageType, screenRes;

		System.out.println("Select screen size:");
		screenSize = scan.nextDouble();
		switch(screenSize) {
			case 13.3:
				price += 200;
				break;
			case 15.0:
				price += 300;
				break;
			case 17.3:
				price += 400;
		}

	}
}