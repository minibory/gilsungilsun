package D21_01_29;

import java.util.Scanner;

public class twochwon22 {

	static void high(int[][] a, int b, int c) {
		int max = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int[][] ary = new int[3][3];
		high(ary, 3, 3);

	}
}