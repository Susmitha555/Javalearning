import java.util.HashSet;

public class Duplicatearray {
	
	public static void main(String[] args) {
		
		String a[]={"sus","dhivi","kalai","dinesh","c+", "c+"};
		
		boolean flag=false;
		//======Approach 1 logic=========
		for(int i=0; i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
				System.out.println("Duplicate elemts present"+a[i]);
				flag=true;
				}
				
			}
			
		}
		
		if(flag==false){
			System.out.println("No Duplicate elemts present");
		}
		
		
		
		
		//======Approach 2 logic using hashset=========
		HashSet<String> hs=new HashSet();
		boolean flag1=true;
		for(String b: a)
		{
			if(hs.add(b)==false){
				System.out.println("Approach 2 Duplicate elemts present"+b);
				flag1=false;
			}
			
		}
		
			
		if(flag1==true){
			System.out.println("No Duplicate elemts present");
		}
		
	}

}
