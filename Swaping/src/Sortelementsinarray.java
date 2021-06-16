import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;

public class Sortelementsinarray {
	
	public static void main(String[] args) {
		
		
		
		int[] a={1,2,3,7,10,4};
		
		System.out.println("Array elemets before sort"+Arrays.toString(a));
		
	//==========approCH1=======	
		Arrays.parallelSort(a);
		System.out.println("approCH1 "  +Arrays.toString(a));
		
	//==========approCH2=======	
		int[] a1={1,2,3,11,10,4};
		System.out.println("Array elemets before sort"+Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("approCH2 "  +Arrays.toString(a1));
		
		
		
	//REVERSE DESCENRING ORDER
		Integer [] a2={1,2,3,11,10,4};
		System.out.println("Array elemets before sort"+Arrays.toString(a2));
		Arrays.sort(a2,Collections.reverseOrder());
		System.out.println("approCH3 desc order "  +Arrays.toString(a2));
		
		
		
		
	}

}
