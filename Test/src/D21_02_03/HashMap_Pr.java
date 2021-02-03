package D21_02_03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Person {
	String name;
	int id;
	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

public class HashMap_Pr {
	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		Person[] p = new Person[3];
		
		for(int i = 0; i < p.length; i++) {
			String name = sc.next();
			int id = sc.nextInt();
			
			p[i] = new Person(name, id);
			h.put(p[i].name, p[i].id);
		}
		
		Set<String> s = h.keySet();

		while(true) {
			System.out.print("이름뭐니? ");
			String name = sc.next();
			if(h.containsKey(name)) {
				System.out.println("답 : " + h.get(name));
			} else if (name.equalsIgnoreCase("Stop")) {
				break;
			} else {
				System.out.println("이름없다.");
			}
		}	
	}
}