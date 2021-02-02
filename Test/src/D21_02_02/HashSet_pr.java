package D21_02_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person1 {
	int num;
	String name;
	Person1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public int hashCode() {
		return num;
	}
	public boolean equals(Object obj) {
		Person1 p = (Person1) obj;
		if(p.num == this.num) {
			return true;
		} else {
			return false;
		}
	}
}

public class HashSet_pr {
	public static void main(String[] args) {
		
		Set<Person1> s=new HashSet<Person1>();
		
		s.add(new Person1(12, "È«±æµ¿"));
		s.add(new Person1(23, "±è±æµ¿"));
		s.add(new Person1(12, "ÀÌ±æµ¿"));
		
		Iterator<Person1> it=s.iterator();
		
		while(it.hasNext()){
			Person1 p=it.next();
			System.out.println(p.num + " " + p.name);
		}
	
	}
}