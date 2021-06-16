import java.util.Scanner;

public class Reverseanumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scb=new Scanner(System.in);
		System.out.println("Enter a number1");
		
		int userinput=scb.nextInt();
		
		
		int rev=0;
		//--------------------------------logic:1------------------------------
		System.out.println("Before revere a string is first logic1"+userinput);
		while (userinput!=0)
		{
			rev=rev*10 +  userinput % 10;
			userinput=userinput/10;		
		}
		
		System.out.println("After reversing a string first logic1 "+rev);
		
		//------------------------------logic:2--------------------------------
		System.out.println("Enter a number 2");
		int userinput1=scb.nextInt();

		System.out.println("Before revere a string is first logic2"+userinput1);
		StringBuffer vg=new StringBuffer(String.valueOf(userinput1));
		System.out.println("After reversing a string first logic2 "+vg.reverse());
				
				
		//------------------------------logic:3--------------------------------
				System.out.println("Enter a number 3");
				int userinput2=scb.nextInt();
				System.out.println("Before revere a string is first logic2"+userinput2);
				StringBuilder vg1 =new StringBuilder();
				vg1.append(userinput2);
				System.out.println("After reversing a string first logic2 "+vg1.reverse());
	}

}
