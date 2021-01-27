public class ichawon {
	public static void main(String[] args) {

		int[][] aa = new int[3][4];

		int val = 1;

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 4; k++) {
				aa[i][k] = val;
				val = val + 2;
			}
		}
		
		for (int i = 2; i >= 0; i--) {
			for(int k = 3; k >= 0; k--) {
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.println();
		}

	}
}