import java.util.Scanner;

public class P254_18 {

	public static void main(String[] args) {

		int Max = 0, Min = 0, Num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �Է� : ");
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 'A'; j <= 'Z'; j++) { // �빮��
				if (s.charAt(i) == j) {
					Max++;
				}
			}
			for (int j = 'a'; j <= 'z'; j++) { // �ҹ���
				if (s.charAt(i) == j) {
					Min++;
				}
			}
			for (int j = '0'; j <= '9'; j++) { // ����
				if (s.charAt(i) == j) {
					Num++;
				}
			}
		}
		System.out.println("�빮�� " + Max + "��, �ҹ��� " + Min + "��, ���� " + Num + "��.");
		sc.close();
	}
}