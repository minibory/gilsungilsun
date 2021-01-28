package D21_01_28;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ÀÔ·Â : ");
		int a = sc.nextInt();			//ÀÔ·Â¹Þ±â
//		int a = (int)(Math.random() * 100) + 1;		//·£´ý°ª ¹Þ±â
		
		if(a % 3 == 0 && a != 0) {
			System.out.print("Â¦");
			if(a > 10 && (a / 10) % 3 == 0) {
				System.out.print("Â¦");
			}
		} else {
			System.out.println("¶¯");
		}
	}
}