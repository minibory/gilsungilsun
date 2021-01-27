package Programmers;

class Crean {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] basket = new int[board.length * board.length];

		int i, j, k = 0;

		for (i = 0; i < moves.length; i++) {
			for (j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					basket[k++] = board[j][moves[i] - 1];
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		
		i = 1;
		while (basket[i] != 0) {
			if (basket[i] == basket[i - 1]) {
				j = i;
				k = i - 1;
				while (basket[j] > 0) {
					basket[j - 1] = basket[j + 1];
					j++;
				}
				if(i == 1) {
				} else {
					i--;
				}
				answer += 2;
			} else {
				i++;
			}
		}
		return answer;
	}
}

public class Dollcrane {
	public static void main(String[] args) {

		int[][] a = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 },
	{ 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };
		int[] m = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(Crean.solution(a, m));
		
	}
}