package Programmers;

class Sol {
	public String solution(String new_id) {
		String answer = "";
		int a = 'a' - 'A';
		char c;
		for (int i = 0; i < new_id.length(); i++) {
			if('A' <= new_id.charAt(i) && new_id.charAt(i) <= 'Z') {
				c = (char) (new_id.charAt(i) + a);
				new_id.charAt(i) = c;
			} 
		}

		return answer;
	}
}

public class new_id {
	public static void main(String[] args) {

	}
}