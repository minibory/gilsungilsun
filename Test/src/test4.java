public class test4 {
	static void show(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		int[] ary = { 6, 2, 8, 4, 9 };
		show(ary);
	}
}