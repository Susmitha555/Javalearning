import java.util.Scanner;

public class Largestof4numbers {
	
	public static void main(String[] args) {
		
		
	//--------------------------logic1-------------------
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st numebr");
		int a=sc.nextInt();
		
		System.out.println("Enter a 2nd numebr");
		int b=sc.nextInt();
		
		System.out.println("Enter a 3rd numebr");
		int c=sc.nextInt();
		
		System.out.println("Enter a 4th numebr");
		int d=sc.nextInt();
		
		
	
		if(a>b && a>c && a>d)
		{
			System.out.println("A is the largest");
		}
		else if(b>a && b>c && b>d){
			System.out.println("B is the largest");
		}
		else if(c>b && c>a && c>d){
			System.out.println("C is the largest");
		}
		
		else if(d>a && d>b && d>c){
			System.out.println("d is the largest");
		}
		
		else{
			System.out.println("A and b, c  is the same");
		}
		
		//--------------------------logic2 using ternary operator-------------------
		

		int largest=a>b?a:b;
		largest=c>largest?c:largest;
		largest=d>largest?d:largest;
		System.out.println("Largestof4numbers"+largest);
		
	}
	

}
