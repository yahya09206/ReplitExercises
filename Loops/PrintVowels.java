/*
Create a program that will take the given String In and print out all the vowels from the String.
*/
import java.util.Scanner;
public class PrintVowels {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String result = "";

		for (int i = 0; i < word.length(); i++){
      		char ch = word.charAt(i);
      		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        		result += ch;
        	}
    	}
    	System.out.println(result);
	}
}