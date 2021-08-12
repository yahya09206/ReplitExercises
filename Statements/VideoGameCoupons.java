/*
The video games machines at your local arcade outputs coupons according to how well you play the game.

You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get. You perfer candy bars.

if you the coupons are not enough for any redeem, display message:

"Not enough coupons"
*/
import java.util.Scanner;
public class VideoGameCoupons {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int coupons = scan.nextInt();

		int candyBar = coupons / 10;
		int gumBall = (coupons % 10) % 3;

		if(coupons >= 3){
			System.out.println("Number of Candies: " + candyBar + "\nNumber of Gumballs: " + gumBall);
		}
	}
}