public class test2 {
	static int same(int[] a, int[] b) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[j] == a[i]) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {

		int[] lotto = { 4, 10, 25, 30, 45, 47 };
		int[] my = { 1, 4, 7, 26, 45, 48 };
		int r;

		r = same(lotto, my);
		System.out.printf("일치하는 번호의 개수 : %d\n", r);
	}
}
