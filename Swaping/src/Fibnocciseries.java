
public class Fibnocciseries {
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int sum=0;
		
		System.out.println(""+num1); 
		System.out.println(""+num2);
		
		for(int i=2; i<20; i++){
			
			sum=num1+num2;// 1
			System.out.println(""+sum); 
			num1=num2;
			num2=sum;
		}
		
		
		
		
	}
	
	
	

}
