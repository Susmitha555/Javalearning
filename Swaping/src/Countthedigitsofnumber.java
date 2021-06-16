
public class Countthedigitsofnumber {
	
	public static void main(String[] args) {
		
		
		int num=456789673;
		
		int count=0;
		
		while(num>0){
			
			num=num/10;
			count++;
		}
	
	System.out.println("The count of a number is "+count);
	}

}
