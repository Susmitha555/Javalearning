import java.util.Scanner;


public class Palindromestring {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String Originalstring=sc.next();
		
		StringBuffer sc1=new StringBuffer(Originalstring);
		StringBuffer reversedstring=sc1.reverse();
		if(Originalstring.equalsIgnoreCase(reversedstring.toString()))
		{
			System.out.println("String is a palindrome  REversed "+ reversedstring.toString() );
		}
		
		
		else {
			System.out.println("String is NOT a palindrome REversed "+ reversedstring.toString() );
		}
		
	}
}
