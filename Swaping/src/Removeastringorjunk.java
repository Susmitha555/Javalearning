
public class Removeastringorjunk {
	
	public static void main(String[] args) {
		
		String s="@^@&#&#*$)(*#&$ susmitha 12388934";
		s.replaceAll("[^a-zA-Z0-9]", "");
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
