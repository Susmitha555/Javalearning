import java.util.Scanner;

public class Largestof2numbers {
	
	public static void main(String[] args) {
		
		//--------------------logic1-----
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st numebr");
		int a=sc.nextInt();
		
		System.out.println("Enter a 2nd numebr");
		int b=sc.nextInt();
		
		
		if(a>b)
		{
			System.out.println("A is the largest");
		}
		else if(b>a){
			System.out.println("B is the largest");
		}
		else{
			System.out.println("A and b  is the same");
		}
		
		//--------------------logic2--------
		int largest=a>b?a:b;
		System.out.println("largst of 2 numbers"+largest);
	
	}
	

}
