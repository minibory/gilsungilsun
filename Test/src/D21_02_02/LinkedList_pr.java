package D21_02_02;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_pr {
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("one");
		l.add("two");
		l.add("three");
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			if(s.compareTo("three") == 0) {
				l.remove(s);
			}
		}
		System.out.println(l);
	}
}