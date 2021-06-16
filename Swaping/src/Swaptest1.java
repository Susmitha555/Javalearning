
public class Swaptest1 {
	
	public static void main (String []args){
		//swaping a numbers  
		
		int num1=30;
		int num2=27;
		System.out.println("Before  swapiung a number  "+num1 +   num2 );
//		//--------------------------------------logic1:------------------------
		int num3;
		
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("After swaping logic1 " +num1 +  num2);
		
		//---------------------------------logic2: + ,- oprerator-----------------
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swaping logic2 with the logic 1 as an input " + num1 +  num2);

		//--------------------------------------logic3: * ,/ oprerator---------------------
		
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		
		System.out.println("After swaping logic 3 with the logic 2 as an input " + num1 +  num2);
		
		
		}

}
