/*
Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given. There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No) Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:
*/
import java.util.Scanner;
public class TipCalculator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split =scan.nextLine();
        System.out.println("Number of people:");
        int people = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String Quality=scan.next();;
        String r=(people==1)?"&":(people==2)?"&&":(people==3)?"&&&"
                :(people==4)?"&&&&":"&&&&&";

        System.out.println("Number of people entered: "+r);
        double totaltip=0;
        if (Quality.equalsIgnoreCase("Poor")){
            totaltip = checkAmount*0.05;
        }else if (Quality.equalsIgnoreCase("Fair")){
            totaltip=checkAmount*0.10;
        }else if (Quality.equalsIgnoreCase("Good")){
            totaltip=checkAmount*0.15;
        }else if(Quality.equalsIgnoreCase("Great")){
            totaltip=checkAmount*0.20;
        }else{
            totaltip=checkAmount*0.25;
        }

        System.out.println("Total to pay: "+ (checkAmount+totaltip));
        System.out.println("Total tip: " +totaltip);
        System.out.println("Total per person: " +(checkAmount+totaltip)/people);
        System.out.println("Tip per person: " +totaltip/people);
	}
}