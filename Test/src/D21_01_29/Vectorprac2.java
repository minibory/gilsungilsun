package D21_01_29;

import java.util.Vector;

class Xy {
	int a, b;

	Xy(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return a + " " + b;
	}

}

public class Vectorprac2 {
	public static void main(String[] args) {

		Vector<Xy> v = new Vector<Xy>();

		v.add(new Xy(4, 7));
		v.add(new Xy(5, 9));
		v.add(new Xy(10, 11));
		v.remove(2);

		for (int i = 0; i < v.size(); i++) {
			Xy x = v.get(i);
			System.out.println(x);
		}

	}
}