
public class Evenandoddfromarray {
	
	public static void main(String [] args)
	{
	
	int a[]={1,2,3,4,5,6};
	
	
	System.out.println( "even numbers");
	for(int i=0;i<a.length;i++){
		
		if(a[i]%2==0)
		{
			System.out.println( "" +a[i]);
			 
		}
		}
	

	System.out.println( "odd numbers");
	for(int i=0;i<a.length;i++){
		
		if(a[i]%2!=0)
		{
			System.out.println( "" +a[i]);
			 
		}
		}
	
	
		

		System.out.println( "Enhaced for loop");
		System.out.println( "even numbers");
		for(int value:a)
		{
			if(value%2==0)
			System.out.println( "" +value);
		}
		
		System.out.println( "Enhaced for loop");
		System.out.println( "odd numbers");
		for(int value:a)
		{
			if(value%2!=0)
			System.out.println( "" +value);
		}
}

}
