import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[sc.nextInt()];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 101);
			System.out.print(a[i] + " ");
		}
	}
}