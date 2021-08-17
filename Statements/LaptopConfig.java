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
		int ram, memorySize;
		double screenSize = 0.0, price = 0.0;
		String cpu = "", storageType, screenRes;

		//Screen size
		System.out.println("Select screen size:");
		screenSize = scan.nextDouble();
		System.out.println("Select screen size:");
        screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else if (screenSize == 17.3) {
            price += 400;
        } else {
            System.out.println("Invalid screen size!");
        }
		//CPU Type
		System.out.println("Select CPU type:");
		cpu = scan.next();
		switch(cpu){
			case "i3":
				price += 150;
				break;
			case "i5":
				price += 250;
				break;
			case "i7":
				price += 350;
				break;
			default:
				System.out.println("Invalid CPU type!");
		}
		//RAM
		System.out.println("Select RAM size:");
        ram = scan.nextInt();
        if (ram > 0) {
            price += (ram / 4) * 50;
        } else {
            System.out.println("Invalid ram size!");
        }

        //Storage Type
        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Select memory size:");
        memorySize = scan.next();
        if(storageType.equalsIgnoreCase("HDD") && memorySize > 0){
        	price += (memorySize) / 500 * 50;
        }else if(storageType.equalsIgnoreCase("SSD") && memorySize > 0){
        	price += (memorySize) / 500 * 100;
        }else {
        	System.out.println("Invalid memory type or size!");
        }

        //Screen Res
        System.out.println("Enter screen resolution");
        screenRes = screenRes.next();
        if(screenRes.equalsIgnoreCase("fullhd")){
        	price += 100;
        }else if(screenRes.equalsIgnoreCase("4k")){
        	price += 200;
        }else {
        	System.out.println("Invalid screen size!");
        }
        System.out.println("Laptop price is: $" + price);
	}
}