
public class Reverseastring {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Suganya";
		
		
		String reverse = "";
		
		//-------------------------------------logic:1--------------------------
		System.out.println("Before revere a string is first logic 1 "+name);
		StringBuffer vg=new StringBuffer(name);
		System.out.println("After reversing a string first logic 1 "+vg.reverse());
		
		
		//-------------------------------------logic:2--------------------------
				System.out.println("Before revere a string is first logic 2 "+name);
				StringBuilder vg1=new StringBuilder();
				vg1.append(name);
				System.out.println("After reversing a string first logic 2  "+vg1.reverse());
				
		
		//--------------------------------------logic:3------------------
		String name1="Suganya1";
		String reverse1 = "";
		System.out.println("Before revere a string is secondlogic"+name1);	
		
	for( int i=name1.length()-1;i>=0; i--)
		{
		reverse1=reverse1+name1.charAt(i);
		}
		System.out.println("After reversing a string secondlogic "+reverse1);
		
		//---------------------------------------logic:3------------------------
		String name2="Suganya1";
		String reverse2 = "";
		System.out.println("Before revere a string third logic  "+name2);	
		char a[]=name2.toCharArray();
		for (int i=a.length-1;i>=0;i--)
		{
			reverse2=reverse2+a[i];
			
		}

		System.out.println("After reversing a string third logic "+reverse2);
	}
	
	
	
	

}
