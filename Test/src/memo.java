import java.util.InputMismatchException;
import java.util.Scanner;

public class memo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		int sum = 0;
		
		for (int i = 0; i < ary.length; i++) {
			try {
				System.out.print(i + 1 + "��° ���� : ");
				ary[i] = sc.nextInt();
				sum += ary[i];
			} catch (InputMismatchException e) {
				System.out.println("�ٽ� �Է��ض�. ���� �ƴϴ�.");
				i--;
				sc.nextLine();
			}
		}
		System.out.println("���� : " + sum);
	}
}