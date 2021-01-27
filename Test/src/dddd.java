import java.util.Scanner;

class PhoneNum {
	String name;
	String phone;

	PhoneNum(String n, String p) {
		name = n;
		phone = p;
	}
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
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
		System.out.println("전공 : " + major);
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
		System.out.println("부서 : " + grade);
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
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("번호 : ");
		String num = sc.next();
		
		switch(ch) {
		case 'A':
			System.out.print("전공 : ");
			String major = sc.next();
			add(new School(name, num, major));
			break;
		case 'B':
			System.out.print("부서 : ");
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
			System.out.println("A.학교 친구 정보");
			System.out.println("B.직장 동료 정보");
			System.out.println("C.종료");
			System.out.println("D.출력");
			System.out.println("문자 입력");
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
				System.out.println("종료합니다.");
				return;
			case 'D':
				a.all();
			}
		}
	}
}