package Programmers;
class Solution {
	public static String solution(int n) {
		String[] nums = {"4", "1", "2"};
		String answer = "";
		
		while(n > 0) {
			answer = nums[n % 3] + answer;
			n = (n - 1) / 3;
		}
		return answer;
	}
}


public class dddd {
	public static void main(String[] args) {

		System.out.println(Solution.solution(14));
	}
}