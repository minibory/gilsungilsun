//interface Po {
//	void pr(int a, String b);
//	void pr(String b);
//}
//
//class Point implements Po {
//
//	public void pr(int a, String b) {
//		System.out.println(b + "å�� " + a + "��");
//	}
//	public void pr(String b) {
//		System.out.println(b);
//	}
//}

interface Re {
	abstract int area();
	default void show() {
		System.out.println("�簢��!!");
	}
}

class Rec1 implements Re {
	int a, b;
	Rec1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int area() {
		return a * b;
	}
	
}
public class cccc {
	public static void main(String[] args) {

		Re r = new Rec1(10, 20);
		r.show();
		System.out.println("���� " + r.area());
		
		
		
		
//		Po p = new Point();
//		p.pr(30000, "java");
//		p.pr("python");
	}
}