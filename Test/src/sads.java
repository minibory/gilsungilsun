import java.util.Scanner;

public class sads {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		int i = 1;

		while (i <= 100) {
			if (i % 2 == 0 && i % 7 == 0) {
				sum += i;
				System.out.println(i);
				i++;
			}
		}
		System.out.println(sum);

	}

}
