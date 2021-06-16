import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writingdataintotextfile {
	
	public static void main(String[] args) throws IOException  {
		
		
		FileWriter fw=new FileWriter("E:\\Selenium pack\\BO_Pages\\learning\\Swaping\\Suswritefile.txt");
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("Sus");
		bf.newLine();
		bf.write("dhivi");
		bf.newLine();
		bf.write("mass");
	
		
		System.out.println("Wrote into file");
		
		bf.close();
		
		
		
	}

}
