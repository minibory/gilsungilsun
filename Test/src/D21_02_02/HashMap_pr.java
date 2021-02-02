package D21_02_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMap_pr {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1, "one");
		h.put(2, "two");
		h.put(3, "three");
		
		Set<Integer> key = h.keySet();
		Iterator<Integer> it = key.iterator();
	
		while(it.hasNext()) {
			int k = sc.nextInt();
			switch(k) {
			case 1:
				System.out.println(h.get(k));
				break;
			case 2:
				System.out.println(h.get(k));
				break;
			case 3:
				System.out.println(h.get(k));
				break;
			}
		}
		
		
	}
}