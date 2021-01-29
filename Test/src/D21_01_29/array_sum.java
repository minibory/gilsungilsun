package D21_01_29;

public class array_sum {

	static int[] add(int[] ar, int a) {
		int[] b = new int[a];
		for(int i = 0; i < a;i++) {
			b[i] = ar[i];
		}
		return b;
	}

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };
		int[] r = add(ar, 5);

		int sum = 0;
		
		for (int i = 0; i < r.length; i++) {
			sum += r[i];
		}
		System.out.println(sum);
	}

}
