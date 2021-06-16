import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readdatefromafile {
	
	public static void main(String[] args) throws IOException {
		
		//Approach 1 Filereader and Bufferreader classe
		
		
		FileReader fr=new FileReader("E:\\Selenium pack\\BO_Pages\\learning\\Swaping\\Sustest.txt");
		
		BufferedReader bf=new BufferedReader(fr);
		String str;
   
    	 while((str=bf.readLine())!=null){
    	  System.out.println("Approach 1  " +  str);
    	 }
    	  
    	//Approach 2  sacner and file
  		
  		
  		File fl=new File("E:\\Selenium pack\\BO_Pages\\learning\\Swaping\\Sustest.txt");
  		
  		Scanner sr=new Scanner(fl);

  		while(sr.hasNextLine())
  		{
  			System.out.println("Approach 2  "+sr.nextLine());
  		}
  		
  		
			//Approach 3  sacner and file
  		
  		
  		File fl1=new File("E:\\Selenium pack\\BO_Pages\\learning\\Swaping\\Sustest.txt");
  		
  		Scanner sr1=new Scanner(fl1);
  		sr1.useDelimiter("\\Z");
  		System.out.println( "Approach 3  "+sr1.next());
		
	}
    	 
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

