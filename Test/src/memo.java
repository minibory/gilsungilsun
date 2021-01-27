import java.util.InputMismatchException;
import java.util.Scanner;

public class memo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		int sum = 0;
		
		for (int i = 0; i < ary.length; i++) {
			try {
				System.out.print(i + 1 + "번째 정수 : ");
				ary[i] = sc.nextInt();
				sum += ary[i];
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해라. 정수 아니다.");
				i--;
				sc.nextLine();
			}
		}
		System.out.println("총합 : " + sum);
	}
}