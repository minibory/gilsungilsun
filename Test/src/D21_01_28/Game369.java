package D21_01_28;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		
//		int a = (int)(Math.random() * 100) + 1;		//������ �ޱ�
		int a = sc.nextInt();			//�Է¹ޱ�
		
		int b = a % 10;		//���� �ڸ� 3, 6, 9 �̱�
		int c = a / 10;		//���� �ڸ� 3, 6, 9 �̱�
		
		if(b % 3 == 0 && a != 0) {
			System.out.print("¦");
			if(c % 3 == 0 && a > 10) {
				System.out.print("¦");				
			}
		} else {
			System.out.println("��");
		}
	}
}