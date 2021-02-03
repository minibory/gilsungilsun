package D21_02_03;

import java.util.*;

public class Entry_Pr {
	public static void main(String[] args) {
		
		Map<Integer, Double> m = new HashMap<Integer, Double>();
		
		m.put(2, 2.5);
		m.put(3, 3.5);
		m.put(5, 4.5);
		
		Set<Map.Entry<Integer, Double>> key = m.entrySet();
		
		for(Map.Entry<Integer, Double> m1 : key) {
			System.out.println(m1.getKey());
		}
	}
}