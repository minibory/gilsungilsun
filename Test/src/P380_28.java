import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class P380_28 {
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("in.txt");
		FileWriter fw = new FileWriter("out.txt");

		BufferedReader br = new BufferedReader(fr);

		String str1 = "", str2 = "";

		while ((str1 = br.readLine()) != null) {
			for (int i = str1.length() - 1; i >= 0; i--) {
				str2 += str1.charAt(i);
			}
			str2 += "\n";
		}
		fw.write(str2);
		fr.close();
		fw.close();
	}
}
