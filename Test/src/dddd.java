import java.util.Scanner;

class PhoneNum {
	String name;
	String phone;

	PhoneNum(String n, String p) {
		name = n;
		phone = p;
	}
	void show() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
	}
}

class School extends PhoneNum {
	String major;

	School(String n, String p, String m) {
		super(n, p);
		this.major = m;
	}
	void show() {
		super.show();
		System.out.println("���� : " + major);
	}
}

class Worker extends PhoneNum {
	String grade;
	Worker(String n, String p, String g) {
		super(n, p);
		this.grade = g;
	}
	void show() {
		super.show();
		System.out.println("�μ� : " + grade);
	}
}

class Arr {
	PhoneNum[] ary;
	int n;
	
	Arr(int n) {
		ary = new PhoneNum[n];
		n = 0;
	}
	void add(PhoneNum p) {
		ary[n++] = p;
	}
	void friend(char ch) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��ȣ : ");
		String num = sc.next();
		
		switch(ch) {
		case 'A':
			System.out.print("���� : ");
			String major = sc.next();
			add(new School(name, num, major));
			break;
		case 'B':
			System.out.print("�μ� : ");
			String grade = sc.next();
			add(new Worker(name, num, grade));
			break;
		}
	}
	
	void all() {
		for(int i = 0; i < ary.length;i++) {
			ary[i].show();
		}
	}
}

public class dddd {
	public static void main(String[] args) {

		Arr a = new Arr(5);
		
		while(true) {
			System.out.println("A.�б� ģ�� ����");
			System.out.println("B.���� ���� ����");
			System.out.println("C.����");
			System.out.println("D.���");
			System.out.println("���� �Է�");
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			
			switch(c) {
			case 'A':
				a.friend(c);
				break;
			case 'B':
				a.friend(c);
				break;
			case 'C':
				System.out.println("�����մϴ�.");
				return;
			case 'D':
				a.all();
			}
		}
	}
}