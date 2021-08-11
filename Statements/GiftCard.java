/*
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 15$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement
*/
import java.util.Scanner;
public class GiftCard {
	public static void main(String[] args){
		//WRITE YOUR CODE HERE
    Scanner scan = new Scanner(System.in);

		int balance = 100;
		String input = scan.nextLine();

		//nested if else to determine price and if valid
		if (input.equals("Blanket")) {
			balance -= 60;
			System.out.println("Thank you for your purchase! ");
      System.out.println("Your current balance is: " + balance + "$");
		}else if (input.equals("Charger")){
			balance -= 15;
			System.out.println("Thank you for your purchase!");
      System.out.println("Your current balance is: " + balance + "$");
		}else if (input.equals("Hat")){
			balance -= 25;
			System.out.println("Thank you for your purchase! ");
      System.out.println("Your current balance is: " + balance + "$");
		}else if (input.equals("Headphones")){
			balance -= 30;
			System.out.println("Thank you for your purchase! ");
      System.out.println("Your current balance is: " + balance + "$");
		}else if (input.equals("Laptop")){
			System.out.println("Sorry, not enough funds on your gift card!");
		}else if (input.equals("Pants")){
			balance -= 50;
			System.out.println("Thank you for your purchase! ");
      System.out.println("Your current balance is: " + balance + "$");
		}else if (input.equals("Pillow")){
			balance -= 40;
			System.out.println("Thank you for your purchase! ");
      System.out.println("Your current balance is: " + balance + "$");
		}else if (input.equals("Smartphone")){
			System.out.println("Sorry, not enough funds on your gift card!");
		}else if (input.equals("Socks")){
			balance -= 5;
			System.out.println("Thank you for your purchase!");
      System.out.println("Your current balance is: " + balance + "$");
		}else if (input.equals("USB cable")){
			balance -= 10;
			System.out.println("Thank you for your purchase!");
      System.out.println("Your current balance is: " + balance + "$");;
		}else {
			System.out.println("Invalid item!");
		}
	}
}