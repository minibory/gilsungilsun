import java.util.Scanner;

public class P379_26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("첫번째 수 입력: ");
			int a = sc.nextInt();
			System.out.print("연산자: ");
			char c = sc.next().charAt(0);
			System.out.print("두번째 수 입력: ");
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
					throw new Exception("곱해봤자 0임..");
				break;
			case '/':
				if(b == 0)
					throw new Exception("0으로 못나눔..");
				break;
			}
		} catch (Exception e) {
			System.out.println("오류");
			System.out.println(e.getMessage());
		}

	}
}
