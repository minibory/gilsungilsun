package D21_01_29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayLIst_practice1 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(1);
		v.add(2);
		v.add(3);
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
	}
}