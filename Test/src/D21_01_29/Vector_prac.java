package D21_01_29;

import java.util.Vector;

public class Vector_prac {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();

		v.add(new Integer(5));
		v.add(5);
		v.add(10);
		v.add(0, 20);
		System.out.println(v.size());

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}

	}
}
