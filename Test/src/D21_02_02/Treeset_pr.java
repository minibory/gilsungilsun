package D21_02_02;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_pr {
	public static void main(String[] args) {
		
		TreeSet<Integer> grade = new TreeSet<Integer>();
		
		grade.add(30);
		grade.add(50);
		grade.add(100);
		
		Integer i = grade.first();
		System.out.println(i);
		
		i = grade.last();
		System.out.println(i);
		
		i = grade.lower(new Intger(80));
		System.out.println(i);
		
	}
}