/*
Given a String txt print the value without the last letter
*/
import java.util.Scanner;
public class StringNoEnd {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String txt = s.next();
		int word = txt.length() - 1;
    	String result = txt.substring(0, word);
    	//your code here
    	System.out.println(result);
	}
}