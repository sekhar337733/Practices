package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchroniztioninArrayList {

	public static void main(String[] args) {

		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Java");
		list.add("Ruby");
		list.add("Pearl");
		
		synchronized (list) {
			
			Iterator<String> l = list.iterator();
			
			while(l.hasNext()) {
				System.out.println(l.next());
			}
		}
		

	}

}
 