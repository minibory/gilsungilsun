package D21_02_01;

import java.util.ArrayList;

class Profile {
	String id;
	int age;
	Profile(String id, int age) {
		this.id = id;
		this.age = age;
	}
}

public class ArrayList_generic {
	public static void main(String[] args) {
		
		ArrayList<Profile> p = new ArrayList<Profile>();
		
		p.add(new Profile("aa", 12));
		p.add(new Profile("bb", 17));
		p.add(new Profile("cc", 15));
		
		for(int i = 0; i < p.size();i++) {
			Profile pr = p.get(i);
			System.out.println(pr.age + " " + pr.id);
		}
	}
}