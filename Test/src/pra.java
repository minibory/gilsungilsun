import java.util.Scanner;

public class pra {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();

		String str1 = "";
		char ch;
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if('a' <= ch && ch <= 'z') {
				str1 += (char)(ch+32);
			} else if('A' <= ch && ch <= 'Z') {
				str1 += (char)(ch-32);
			} else {
				str1 += (char) ch;
			}
		}
		System.out.printf("%s", str1);
		
		
		
	}
}