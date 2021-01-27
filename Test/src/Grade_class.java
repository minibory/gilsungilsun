class Grade {
	private int english;
	private int math;
	private int science;

	Grade() {
		english = (int) (Math.random() * 100) + 1;
		math = (int) (Math.random() * 100) + 1;
		science = (int) (Math.random() * 100) + 1;
	}
	Grade(int english, int math, int science) {
		this();
		this.english = english;
		this.math = math;
		this.science = science;
	}
	void show() {
		System.out.println();
	}
	double avg() {
		return (english + math + science) / 3.0;
	}
}

public class Grade_class {
	public static void main(String[] args) {

		int[] a = new int[3];

		for (int i = 0; i < 3; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}
		Grade g1 = new Grade();
		Grade g2 = new Grade(a[0], a[1], a[2]);

		System.out.println(g1.avg());
		System.out.println(g2.avg());
	}
}