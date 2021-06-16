
public class sumofarayelements {
	public static void main(String [] args)
	{
		
		
		//----using for loop---------
		int a[]={1,2,3,4,5,6};
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		//----using Enhanced for loop---------
		
		int a1[]={1,2,3,4,5,6,};
		int sum1=0;
		for(int value:a1){
			sum1=sum1+value;
		}
		
		System.out.println("enahnced"+sum1);
	}

}
