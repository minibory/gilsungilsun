import java.util.Scanner;

public class P254_18 {

	public static void main(String[] args) {

		int Max = 0, Min = 0, Num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 'A'; j <= 'Z'; j++) { // 대문자
				if (s.charAt(i) == j) {
					Max++;
				}
			}
			for (int j = 'a'; j <= 'z'; j++) { // 소문자
				if (s.charAt(i) == j) {
					Min++;
				}
			}
			for (int j = '0'; j <= '9'; j++) { // 숫자
				if (s.charAt(i) == j) {
					Num++;
				}
			}
		}
		System.out.println("대문자 " + Max + "개, 소문자 " + Min + "개, 숫자 " + Num + "개.");
		sc.close();
	}
}