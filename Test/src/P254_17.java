import java.util.Scanner;

public class P254_17 {
	public static void main(String[] args) {
		//���ϴ� ����� �հ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int start = sc.nextInt();
		int end = sc.nextInt();
		int x = sc.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % x == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}