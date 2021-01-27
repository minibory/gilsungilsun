import java.util.Scanner;

public class P379_26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("ù��° �� �Է�: ");
			int a = sc.nextInt();
			System.out.print("������: ");
			char c = sc.next().charAt(0);
			System.out.print("�ι�° �� �Է�: ");
			int b = sc.nextInt();
			switch (c) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				if((a==0 || b == 0))
					throw new Exception("���غ��� 0��..");
				break;
			case '/':
				if(b == 0)
					throw new Exception("0���� ������..");
				break;
			}
		} catch (Exception e) {
			System.out.println("����");
			System.out.println(e.getMessage());
		}

	}
}
