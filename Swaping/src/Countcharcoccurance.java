
public class Countcharcoccurance {

	public static void main(String[] args) {

		String s="java java jaaa ";
		
		
		int totalcount=s.length();
		System.out.println(s.length());
		
		s=s.replace("j", "");
		
		System.out.println(s.length());
		int totalcountafterrmove=s.length();
	  int count=totalcount-totalcountafterrmove;
	  
	  System.out.println(count);

	}

}
