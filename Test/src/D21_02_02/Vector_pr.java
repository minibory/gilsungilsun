package D21_02_02;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Person {
	private String name;
	private int id;

	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	String getName() {
		return name;
	}

	int getId() {
		return id;
	}

	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if ((p.getId() == this.id) && (p.getName().equals(this.name))) {
			return true;
		}
		return false;
	}
}

class Game {
	Scanner sc = new Scanner(System.in);
	Vector<Person> v = new Vector<Person>(5);

	Game() {
		v.add(new Person("����", 123));
		v.add(new Person("����", 124));
		v.add(new Person("����", 125));
		v.add(new Person("����", 126));
	}

	void in() {
		while (true) {
			String name = sc.next();

			if (name.equals("stop")) {
				break;
			}
			int id = sc.nextInt();
			Person pp = new Person(name, id);

			if (v.contains(pp)) {
				System.out.println("(" + pp.getName() + ")" + "�� �̹� �ִ�.");
			} else {
				v.add(pp);
			}

		}
	}

	void out() {
		while (true) {
			Random r = new Random();
			int n = r.nextInt(v.size());

			Person p = v.get(n);
			String str = p.getName();

			System.out.println(str + "�� id��?");
			int id = p.getId();

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i == -1) {
				break;
			}
			if (i == p.getId()) {
				System.out.println("����");
			} else {
				System.out.println("����ƴ�");
			}
		}
	}

	void end() {
		System.out.println("����");
		System.exit(0);
	}
}

public class Vector_pr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Game g = new Game();

		while (true) {
			System.out.println("1, 2, 3");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}

	}
}