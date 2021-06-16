import java.util.Scanner;

/*concepts of prime number
  * given number is>1
  * given number is divisbile   1 and number itself

ex: 19 -> 19/1=19, 19/19=1 1,19 is the only 2 factors

more than 2 factors other than 1 and num  itself is not a prime
ex:24 -> 24/1,24/24,24/2,24/3,24/4;;;

*/

public class Primenumornot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1){
			
			for(int i=1;i<=num;i++){

				if(num%i==0)
				count++;
				}
			
			if(count==2){
				System.out.println(" prime number");
				
				}
			else{
				System.out.println("Not a prime number");
				
			}
		}
		
		
		else{
			System.out.println("Not a prime number");
			
		}

	}

}
