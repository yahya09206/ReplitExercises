/*
A variable inhabitants represents a city and its respective populations. City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population. Write a program to loop the city population and make it lose half of its population until population is zero. Print the each day like below for each day:
*/
import java.util.Scanner;
public class Inhabitants {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();
		int day = 0;

		if (inhabitants != 0) {
			do {
				System.out.println("Day " + day + " [" + inhabitants + "]");
				day++;
				inhabitants /= 2;
			}while(inhabitants > 0);
			System.out.println("---- EXTINCT ----");
		}else {
			System.out.println("---- EXTINCT ----");
		}
	}
}