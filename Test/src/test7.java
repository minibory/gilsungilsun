import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test7 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("Sample.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(sc.nextLine());
		bw.close();

//		FileReader fr = new FileReader("Sample.txt");
//		BufferedReader br = new BufferedReader(fr);
//
//		String str = null;
//		String[] str2 = new String[10];
//
//		int i = 0;
//		while ((str = br.readLine()) != null) {
//			str2[i] = str;
//			i++;
//		}
//		for (String str3 : str2) {
//			if (str3 == null) {
//				break;
//			}
//			System.out.print(str3 + " ");
//		}
		bw.close();
		fw.close();
	}
}
