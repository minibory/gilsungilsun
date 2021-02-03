package D21_02_03;

import java.util.*;

public class Map_Entry_pr {
	public static void main(String[] args) {

		Map<String, Integer> h = new HashMap<String, Integer>();

		for (int i = 0; i < 3; i++) {
			int n = (int) (Math.random() * 101);
			h.put((i + 1) + "¹ø", n);
		}

		Set<Map.Entry<String, Integer>> s = h.entrySet();
		
		int sum = 0;
		int max = 0;
		String name = "";

		for (Map.Entry<String, Integer> s1 : s) {
			if (max < s1.getValue()) {
				max = s1.getValue();
				name = s1.getKey();
			}
			sum += s1.getValue();
		}
		double avg = (double) sum / s.size(); // Æò±Õ

		System.out.println(avg + " " + max + " " + name);
	}
}