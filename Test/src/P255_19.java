import java.util.Scanner;

public class P255_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 여러개 입력 : ");
		String row = sc.next();
		
		for (int i = 0; i < row.length(); i++) {
			for (int j = '0'; j <= '9'; j++) {
				if (row.charAt(i) == j) {
					for (int k = 0; k < j - 48; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}
}