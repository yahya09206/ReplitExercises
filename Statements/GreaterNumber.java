/*
Use an if statement to determine if a or b is bigger. Then print:

$number is greater

Examples:
*/
import java.util.Scanner;
public class GreaterNumber {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
    	int a = s.nextInt();
    	int b = s.nextInt();

    	if (a > b) {
    		System.out.println(a + " is greater");
    	}else {
    		System.out.println(b + " is greater");
    	}
	}
}