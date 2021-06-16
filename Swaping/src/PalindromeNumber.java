import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int originalnumber=sc.nextInt();
		int reversednumber=originalnumber;
		int rev=0;
		
		while(originalnumber!=0){
			
			rev=rev* 10  + originalnumber %10;
			originalnumber=originalnumber/10;		
		}
		
		System.out.println("Number reversed is  "+rev);
		
		if(reversednumber==rev)
		{
			System.out.println("Number is a palindrome  REversed "+ rev );
		}
		else{
			System.out.println("Number is NOT a palindrome REversed "+ rev );
		}
		
		

	}

}
