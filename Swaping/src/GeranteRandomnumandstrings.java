import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class GeranteRandomnumandstrings {
	public static void main(String[] args) {
		//-------Random numbers-----------------------
		//--------Approch1-------------
		Random rd=new Random();
		System.out.println(rd.nextInt(100));
		
		rd.nextDouble(); //0.0 <1.0
		
		System.out.println(rd.nextDouble());
		
		//--------Approch2------------- math class
		System.out.println(Math.random());
		
		//----Approach 3----------using Appache Poi
		
		System.out.println(RandomStringUtils.randomNumeric(2));
		
		//-----------Random strings----------------------
		System.out.println(RandomStringUtils.randomAlphabetic(3));
		
	
	}
}
