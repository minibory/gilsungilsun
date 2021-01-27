public class P291_21 {
	public static void main(String[] args) {

		int[][][] a = new int[10][10][10];

		int sum = 0, count = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					a[i][j][k] = count++; 	//(i * 100) + (j * 10) + ((k + 1) * 1);
					sum += a[i][j][k];
				}
			}
		}
		System.out.println(sum);
	}
}