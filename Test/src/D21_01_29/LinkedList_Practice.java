package D21_01_29;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Practice {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("A");
		li.add("B");
		li.add("C");
		
		
		
		Iterator<String> it = li.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			if(s.compareTo("B") == 0) {
				it.remove();
			}
		}
		it = li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
