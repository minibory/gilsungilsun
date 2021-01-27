
public class seven {

	static void pr(int[] a, int b) {
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			n = a[i] / b;
			for (int j = 0; j < n; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int score[] = new int[] { 58, 60, 86, 90, 84 };
		pr(score, 5);
	}
}
