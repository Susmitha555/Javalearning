
public class factorial {
	
	public static void main(String[] args) {
		
		int num=5;
		long fac=1;
		//------------desecding-----
		for(int i=num;i>=1;i--)
		{
			fac=fac*i;
		}
		System.out.println("Decending factorial "+fac);
		
		
		//------------Asending ----
		int num1=5;
		long fac1=1;
		for(int i=1;i<=num1;i++)
		{
			fac1=fac1*i;
		}
		
		
		System.out.println("Asending factorial "+fac1);
	}

}
