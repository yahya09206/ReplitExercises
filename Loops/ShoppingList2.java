/*
Your program should ask use to enter items followed by its price. After adding item, ask user if he wants to add one more item. If so, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items.

Hint: use do while loop.
*/
import java.util.Scanner;
public class ShoppingList2 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		do {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;
			shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
			System.out.println("Add one more item?");
			countinue = scan.next();
			if (countinue.equals("yes")) {
				shoppingListReport += ",";
			}
			count++;
		}while(!countinue.equalsIgnoreCase("no") && count <= 10);

		System.out.print(shoppingListReport);
		System.out.println("Total price: " + totalPrice);
	}
}