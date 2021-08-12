public class Palindrome {
	public static void main(String[] args){
		String str = "Anna";
		String str2 = "";

		for(int i = str.length() - 1; i >= 0; i--){
			str2 += str.charAt(i);
		}
		if(str2.equalsIgnoreCase(str)){
			System.out.println("is Palindrome");
		}
	}
}