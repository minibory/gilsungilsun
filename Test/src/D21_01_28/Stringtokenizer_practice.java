package D21_01_28;

import java.util.StringTokenizer;

public class Stringtokenizer_practice {
	public static void main(String[] args) {
		
		String s = "1+2+3+4+5";
		StringTokenizer st = new StringTokenizer(s, "+");

		int i = 0;
		int sum = 0;
		int[] a = new int[5];

		while(st.hasMoreTokens()) {
			a[i] = Integer.parseInt(st.nextToken().trim());
			sum += a[i];
			i++;
		}
		System.out.println(sum);
	}
}