import java.util.Scanner;

public class P292_22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] stack = new char[5]; // 0 1 2 3 4

		int select = 0, num = 0;
		char car = 'A', cnt = 'A';

		while (select != 3) {
			System.out.print("<1>자동차 넣기 <2>자동차 빼기 <3>끝 : ");
			select = sc.nextInt();

			if (select == 1) {
				stack[num] = car++;
				System.out.println(stack[num] + " 자동차 들어갔습니다.");
				num++;
			} else if (select == 2) {
				if (stack[0] == 0) {
					System.out.println("자동차가 하나도 없습니다.");
				} else {
					System.out.println((cnt++) + " 자동차를 뺍니다.");
					for (int i = 0; i < stack.length; i++) {
						if(stack[i] > 0) {
							stack[i] = stack[i + 1];
						}
					}
					num--;
				}
			} else if(select == 3) {
				System.out.println("현재 " + num + "대의 차가 있습니다.");
				System.out.println("종료합니다.");
			}
		}
		sc.close();
	}
}