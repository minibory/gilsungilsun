package D21_01_29;

import java.util.Scanner;

class Calc {
	public int calculate(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		return sum;
	}
}

public class AtoB_sum2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calc c = new Calc();

		int sum = 0;

		int a = sc.nextInt();
		if (a >= 5 && a <= 10) {
			System.out.println(c.calculate(a));
		} else {
			System.out.println("다시 입력");
		}
	}

}
