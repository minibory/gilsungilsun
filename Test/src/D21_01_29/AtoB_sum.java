package D21_01_29;

import java.util.Scanner;

interface Cal {
	abstract int cal(int a, int b);
}

class Show implements Cal {
	int sum = 0;
	public int cal(int a, int b) {
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}

public class AtoB_sum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		Cal c = new Show();
		System.out.println(c.cal(a, b));

	}
}