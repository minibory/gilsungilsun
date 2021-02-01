package D21_02_01;

import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro> {
	String a;
	
	Pro(String a) {
		this.a = a;
	}
	public int len() {
		return a.length();
	}
	public int compareTo(Pro p) {
		if(len() < p.len()) {
			return -1;
		} else if(len() > p.len()) {
			return 1;
		} else {
			return 0;
		}
	}
	public String toString() {
		return a;
	}
}



public class Treeset_practice1 {

	public static void main(String[] args) {
		TreeSet<Pro> s = new TreeSet<Pro>();
		
		s.add(new Pro("cat"));
		s.add(new Pro("casher"));
		s.add(new Pro("cathome"));

		Iterator<Pro> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}