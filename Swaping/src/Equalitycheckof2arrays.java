import java.util.Arrays;

public class Equalitycheckof2arrays {

	public static void main(String[] args) {
		
		int i[]={1,2,3,4,5,6};
		int j[]={1,2,3,4,7,6};
		
		
		//---------------Approach 1 using equals method of arrays class----------
		boolean result=Arrays.equals(i, j);
		if(result==true){
			System.out.println("Array values are equal "+result);
		}
		else{
			
			System.out.println("Array values are not  equal " +result);
			
		}
		
		
		
		
		//---------------Approach 2----------
		
		boolean value=true;
		
		if(i.length==j.length)
		{
			for(int k=0;k<i.length;k++){
				if(i[k] !=j[k])
				{
					value=false;
				}
			}
		}
		else{
			System.out.println("Approach 2 Array values are not  equal " +value);
		}
		
		if(value==true){
			System.out.println("Approach 2 Array values are   equal " +value);
		}
		else{
			System.out.println("Approach 2 Array values are not  equal " +value);
		}
	}

}
