import java.util.Arrays;

public class Reverseachwordinastring {
	
	public static void main(String[] args) {
		
		String a="Welcome to java and SELENIUM";
		
		String[] arr=a.split(" ");
		System.out.println(Arrays.toString(arr));
		String revrese="";
		
		for(String w:arr)
		{
			String revreseword="";
			for(int i=w.length()-1; i>=0;i--)
			{
				revreseword=revreseword+w.charAt(i);
			}
			revrese=revrese+revreseword+" ";
		
		}
		System.out.println("Approach1  " +revrese); 
		
		
		//====Approach2=========
		
		
		String[] words=a.split("\\s");
		
		String revword="";
		for(String w:words)
		{
			StringBuilder sd=new StringBuilder(w);
			sd.reverse();
			revword=revword+sd.toString()+ " ";
		}
		
		System.out.println("Approach2  " +revword);
	}

}
