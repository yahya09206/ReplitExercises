/*
In the given program you have a quiz question and a scanner to get the user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, or invalid answer.
*/
import java.util.Scanner;
public class Quiz {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
    
    	System.out.println("what is the farthest planet in the solar system:" );
    	System.out.println("a)venus" );
    	System.out.println("b)pluto" );
    	System.out.println("c)neptune" );
    
    	String a = s.nextLine();


    	if(a.equals("b")){
    		System.out.println(a + " is correct");
    	}else if(a.equals("a") || a.equals("c")){
    		System.out.println(a + " is wrong");
    	}else {
    		System.out.println(a + " is not a valid answer");
    	}
	}
}