
public class MissingnuminArray {
	
	public static void main(String[] args) {
		
		/*Condtions:
		 *  Arrays values should not be duplicates
		 * Arrays values can be random
		 * Arrays should ne in properrange (1-)
		 */
		
		/*
		 * sum1-> 5+6+7+9=27
		 * sum2->5+6+7+8+9=35
		 * susm3=sum2-sum1 missing num
		 */
		
		int a[]={5,6,7,9};
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		
		int sum2=0;
		for(int i=5;i<=9;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		int missnum=sum2-sum1;
		
		System.out.println("missnumber "+missnum );
		
	}

}
