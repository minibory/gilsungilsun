import java.io.FileWriter;

public class P379_27 {
	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("gugu.txt");

		String str = "";

		for (int i = 2; i <= 9; i++) {
			str += " #Á¦" + i + "´Ü# ";
		}
		fw.write(str + "\n\r");
		str = "";

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				str += String.format("%2dX%2d=%2d", j, i, j * i);
			}
			fw.write(str + "\n");
			str = "";
		}
		fw.close();
	}
}