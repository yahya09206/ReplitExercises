/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.

If the year is in the provided range print: Your vehicle needs to be recalled!

If the year is fine print: Your vehicle is fine, enjoy!
*/
import java.util.Scanner;
public class VehicleRecall {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter vehicle's year:");
		int carYear = scan.nextInt();

		if (carYear == 1995 || carYear == 1996 || carYear == 1997 || carYear == 1998) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if (carYear == 2001 || carYear == 2002) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if (carYear == 2004 || carYear == 2005 || carYear == 2006){
			System.out.println("Your vehicle needs to be recalled!");
		}else if (carYear == 2015 || carYear == 2016 || carYear == 2017){
			System.out.println("Your vehicle needs to be recalled!");
		}else {
			System.out.println("Your vehicle is fine, enjoy!");
		}
	}
}