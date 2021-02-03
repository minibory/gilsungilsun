package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Solution1 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);	
		for(int i = 0; i < completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
			if(i == completion.length - 1 && answer.equals("")) {
				answer = participant[i+1];
			}
		}
		return answer;
	}
}

public class Maraton {
	public static void main(String[] args) {

		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};
		
		System.out.println(Solution1.solution(a, b));
		
	}
}