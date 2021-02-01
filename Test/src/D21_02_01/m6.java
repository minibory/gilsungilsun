package D21_02_01;

import java.util.ArrayList;
import java.util.Iterator;

public class m6 {
	public static void main(String[] args) {

		ArrayList<Integer> ary = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 101);
			ary.add(n);
		}
		
		Iterator<Integer> it = ary.iterator(); 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}