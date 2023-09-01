package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparetwoArrays {

	public static void main(String[] args) {
		Integer[] val1 = {5,3,5,22,5,6,7,5};
		Integer[] val2 = {5,3,5,22,5,6,5,7};
		
		List<Integer> v1 = new ArrayList<Integer>(Arrays.asList(val1));
		Collections.sort(v1);
		
		List<Integer> v2 = new ArrayList<Integer>(Arrays.asList(val2));
		Collections.sort(v2);
		
		System.out.println(v1.equals(v2));
		
		
		
		
		

	}

}
