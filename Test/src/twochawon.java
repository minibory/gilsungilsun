import java.util.Scanner;

public class twochawon {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int col = sc.nextInt();

		int cnt = 1;

		int[][] a = new int[row][col];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = cnt++;
			}
		}
		System.out.print("행\\열  ");
		for (int i = 0; i < col; i++) {
			System.out.printf("%d열 ", i);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("\n%d행", i);
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}

		}
		sc.close();
	}
}