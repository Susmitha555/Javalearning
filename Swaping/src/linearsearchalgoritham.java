
public class linearsearchalgoritham {
	
	public static void main(String[] args) {
		
		int a[]={10,20,30,50,40};
		
		int findelement=30;
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(findelement==a[i]){
				System.out.println("Matched element found " +a[i]);
				System.out.println("Matched element position is " +i);
				flag=true;
				break;
			}
			
		}
		if(flag==false){
			System.out.println("no matched element");
		}
		
		
		
		
		
		
	}

}

