
public class test5 {

	public static void main(String[] args) {
		int[][] ary = { { 43, 97 }, { 34, 77, 87 }, { 100, 95, 38, 89 } };

		int sum = 0, cnt = 0;
		double avg = 0;
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				sum += ary[i][j];
				cnt++;
			}
		}
		avg = (double)sum / cnt;
		System.out.printf("Че: %d, ЦђБе: %.1f", sum, avg);
	}
}