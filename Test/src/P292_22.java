import java.util.Scanner;

public class P292_22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] stack = new char[5]; // 0 1 2 3 4

		int select = 0, num = 0;
		char car = 'A', cnt = 'A';

		while (select != 3) {
			System.out.print("<1>�ڵ��� �ֱ� <2>�ڵ��� ���� <3>�� : ");
			select = sc.nextInt();

			if (select == 1) {
				stack[num] = car++;
				System.out.println(stack[num] + " �ڵ��� �����ϴ�.");
				num++;
			} else if (select == 2) {
				if (stack[0] == 0) {
					System.out.println("�ڵ����� �ϳ��� �����ϴ�.");
				} else {
					System.out.println((cnt++) + " �ڵ����� ���ϴ�.");
					for (int i = 0; i < stack.length; i++) {
						if(stack[i] > 0) {
							stack[i] = stack[i + 1];
						}
					}
					num--;
				}
			} else if(select == 3) {
				System.out.println("���� " + num + "���� ���� �ֽ��ϴ�.");
				System.out.println("�����մϴ�.");
			}
		}
		sc.close();
	}
}