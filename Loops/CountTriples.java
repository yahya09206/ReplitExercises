/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.
*/
import java.util.Scanner;
public class CountTriple {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
    	int count = 0 ;

    	for (int i = 0; i < str.length(); i++) {
    		if (word.charAt(i) == word.charAt(i)) {
    			count++
    		}else {
    			count = 0;
    		}
    	}
	}
}