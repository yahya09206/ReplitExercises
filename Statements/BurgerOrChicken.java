/*
A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||
*/
import java.util.Scanner;
public class BurgerOrChicken {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String order = scan.next();

		if (order.equals("burger") || order.equals("chicken")) {
			System.out.println(10.0);
		}else if(order.equals("soda")){
			System.out.println(2.0);
		}else {
			System.out.println(3.5);
		}
	}
}