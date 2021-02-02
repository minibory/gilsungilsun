package D21_02_01;

import java.util.Scanner;

class Profile3 {
	String name, id;
	Profile3(String name, String id) {
		this.name = name;
		this.id = id;
	}
	String getname() {
		return name;
	}
	String getid() {
		return id;
	}
}

public class Class_practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ÀÎ¿ø ¼ö : ");
		int n = sc.nextInt();
		Profile3[] p = new Profile3[n];
		
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			String id = sc.next();
			
			p[i] = new Profile3(name, id);
			System.out.println(p[i].getname() + " " + p[i].getid());
		}
	}
}