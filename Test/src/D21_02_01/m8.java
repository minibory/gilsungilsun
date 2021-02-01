package D21_02_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class m8 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("재경", 111);
		h.put("용현", 222);
		
		Set<String> s = h.keySet();
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str + " " + h.get(str));
		}
	}
}