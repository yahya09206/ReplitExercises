/*
Alejandro has many emails and only has time to read the emails that refer to him and a project. Check if his name is found in the email and if project is also included and if it does print "read", but if his name is not in the email print "don't read"
*/
import java.util.Scanner;
public class Alejandro2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		if (a.contains("alejandro") && a.contains("project")) {
			System.out.println("read");
		}
	}
}