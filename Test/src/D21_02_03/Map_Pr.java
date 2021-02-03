package D21_02_03;

class Number {
	static void pr(int a) {
		System.out.println(a);
	}
	void show(double b) {
		System.out.println(b);
	}
}

public class Map_Pr {
	public static void main(String[] args) {
		
		Number.pr(100);
		Number n = new Number();
		n.show(3.14);
		
	}
}