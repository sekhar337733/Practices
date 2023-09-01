package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Java");
		ar.add("Ruby");
		ar.add("C#");
		ar.add("Python");
		ar.add("Pearl");
		System.out.println(ar);
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("C");
		ar1.add("C++");
		ar.addAll(ar1);
		System.out.println(ar);
		/*
		 * ar.clear(); System.out.println(ar);
		 */
		ArrayList<String> clonelist = (ArrayList<String>)ar.clone();
		System.out.println(clonelist);
		
		System.out.println(ar.contains("C"));
		System.out.println(ar.contains("C++"));
		System.out.println(ar.indexOf("Ruby")>1);
		
		//How to conver array to arraylist
		String str[] = {"C","A", "C", "B", "C", "D"};
		
		ArrayList<String> s = new ArrayList<>(Arrays.asList(str));
		System.out.println(s.toString());
		
		System.out.println(s.lastIndexOf("D"));
		
		s.remove("C");
		System.out.println(s);
		
		s.remove("C");
		
		System.out.println(s);
		
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

		num.removeIf(n ->n%2 != 0);
		
		System.out.println(num);
		
		num.retainAll(Collections.singleton(4));
		System.out.println(num);
		
		
		
	}
 
}
