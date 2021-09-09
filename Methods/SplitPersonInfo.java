/*
The method person has a string arguement with this format: "name,last name,age". Print out the person's information
*/
import java.util.Scanner;
public class SplitPersonInfo {
	public static void main(String[] args){

		person("Michael, Williams, 30");
	}
	public static void person(String info){
		String[] information = info.split(",");
		System.out.println("person name: " + information[0]);
		System.out.println("last name: " + information[1]);
		System.out.println("age: " + information[2]);
	}
}