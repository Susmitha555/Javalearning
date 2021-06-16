import java.util.Scanner;

public class Countwords {
	
	public static void main(String[] args) {
	
		System.out.println("Enter a string");
		Scanner ne=new Scanner(System.in);
		
		String s=ne.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			
			if((s.charAt(i)==' ')  && ( s.charAt(i+1)!=0))
			{
				count++;	
			}
		}
		
		System.out.println("number of words in a line "+count);
		
		
		
	}

}
