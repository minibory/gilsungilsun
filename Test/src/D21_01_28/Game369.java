package D21_01_28;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		int a = sc.nextInt();			//�Է¹ޱ�
//		int a = (int)(Math.random() * 100) + 1;		//������ �ޱ�
		
		if(a % 3 == 0 && a != 0) {
			System.out.print("¦");
			if(a > 10 && (a / 10) % 3 == 0) {
				System.out.print("¦");
			}
		} else {
			System.out.println("��");
		}
	}
}