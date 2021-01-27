package Programmers;
class Solution {
	public static int[] solution(int[] progresses, int[] speeds) {
		int max = 100;

		int[] day = new int[progresses.length];
		int[] bag = new int[100];
		
		for (int i = 0; i < progresses.length; i++) {
			while (progresses[i] < max) {
				progresses[i] += speeds[i];
				day[i]++;
			}
		}

		int cnt = 1, j = 0;
		int len = day.length;
		
		for(int i = 0; i < day.length; i++) {
			if(i == day.length - 1) {
				bag[j] = cnt;
			} else {
				if(day[i] >= day[i+1]) {
					len -= 1;
					cnt++;
				} else {
					bag[j++] = cnt;
					cnt = 1;
				}
			}
		}
		
		int[] answer = new int[len];
		
		for(int i = 0 ; i < answer.length; i++) {
			answer[i] = bag[i];
		}
		return answer;
	}
}

public class memo {
	public static void main(String[] agrs) {

		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30 ,5 };

		int[] b = Solution.solution(progresses, speeds);
			for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}