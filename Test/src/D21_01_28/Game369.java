package D21_01_28;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ÀÔ·Â : ");
		
//		int a = (int)(Math.random() * 100) + 1;		//·£´ý°ª ¹Þ±â
		int a = sc.nextInt();			//ÀÔ·Â¹Þ±â
		
		int b = a % 10;		//ÀÏÀÇ ÀÚ¸® 3, 6, 9 »Ì±â
		int c = a / 10;		//½ÊÀÇ ÀÚ¸® 3, 6, 9 »Ì±â
		
		if(b % 3 == 0 && a != 0) {
			System.out.print("Â¦");
			if(c % 3 == 0 && a > 10) {
				System.out.print("Â¦");				
			}
		} else {
			System.out.println("¶¯");
		}
	}
}