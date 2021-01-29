package D21_01_29;

class Gen<T> {
	T a;
	T b;
	Gen(T a, T b) {
		this.a = a;
		this.b = b;
	}
	T one() {
		return a;
	}
	T two() {
		return b;
	}
	boolean three() {
		return a.equals(b);
	}
}

public class genericpr {
	public static void main(String[] args) {
		
		Gen<String> g = new Gen<String>("seoul", "busan");
		System.out.println(g.one());
		System.out.println(g.two());
		System.out.println(g.three());
		
		
	}
}