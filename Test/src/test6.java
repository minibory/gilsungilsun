import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {

		int[] score = new int[5];
		int sum = 0, max = 0, min = 100;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5명 학생 점수 입력: ");
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.print("유효점수: ");
		for(int i = 0 ; i < score.length;i++) {
			if(score[i] == max) {
				continue;
			}
			if(score[i] == min) {
				continue;
			}
			System.out.print(score[i] + " ");
		}
		avg = (double)(sum - max - min) / (score.length - 2);
		System.out.println("\n평균: " + avg);
	}
}
