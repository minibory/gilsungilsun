package D21_02_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Buffered_Networking {
	public static void main(String[] args) {

		BufferedReader in = null;
		ServerSocket so = null;
		Socket soc = null;
		System.out.println("����");

		try {

			so = new ServerSocket(9999);
			soc = so.accept();
			System.out.println("�����");
			in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String msg;

			while (true) {
				msg = in.readLine();
				if (msg.equals("stop")) {
					System.out.println("����");
					break;
				}
			}
			soc.close();
			so.close();
		} catch (Exception e) {}
	}
}