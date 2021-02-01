package D21_02_01;

import java.util.HashSet;
import java.util.Iterator;

class Num {
	int a;
	Num(int a) {
		this.a = a;
	}
	public String toString() {
		return a + "";
	}
	public int hashCode() {
		return a % 3;
	}
	public boolean equals(Object obj) {
		Num num = (Num)obj;
		if(num.a == a) {
			return true;
		} else {
			return false;
		}
		
	}
}

public class HashSet_Generic {
	public static void main(String[] args) {

		HashSet<Num> h = new HashSet<Num>();
		
		h.add(new Num(30));
		h.add(new Num(40));
		h.add(new Num(50));
		h.add(new Num(50));
		h.add(new Num(50));
		
		Iterator<Num> i = h.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
	}
}