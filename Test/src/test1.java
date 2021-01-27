import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test1 {

	public static void main(String[] args) throws Exception {

//		FileOutputStream fos = new FileOutputStream("test.txt");
//
//		byte[] b = { 4, 6, 7, 8, -1, 24 };
//		
//		for (int i = 0; i < b.length; i++) {
//			fos.write(b[i]);
//		}
//		fos.close();

		FileInputStream fis = new FileInputStream("test.txt");

		int ch = 0, i = 0;

		byte[] b = new byte[6];

		while ((ch = fis.read()) != -1) {
			b[i] = (byte) ch;
			i++;
		}
		for (i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		fis.close();
	}
}