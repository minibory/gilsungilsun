interface Figure {
	default void circle_area() {
	}
	default void rec_area() {
	}
}

class Circle implements Figure {
	int r;
	Circle(int r) {
		this.r = r;
	}
	public void circle_area() {
		System.out.println(r * r * 3.14);
	}
}

class Rec implements Figure {
	int a, b;
	Rec(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void rec_area() {
		System.out.println(a * b);
	}
}

public class extendsdd {
	public static void main(String[] args) {
		Figure f1 = new Circle(5);
		Figure f2 = new Rec(2, 5);
		f1.circle_area();
		f2.rec_area();
	}
}