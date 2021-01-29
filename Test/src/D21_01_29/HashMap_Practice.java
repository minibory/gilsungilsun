package D21_01_29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Practice {
	public static void main(String[] args) {
		
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("물", "water");
		h.put("커피", "coffee");
		h.put("티", "tea");
		
		Set<String> keys = h.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			String b = h.get(s);
			System.out.println(s + " " + b);
		}
	}
}