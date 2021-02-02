package D21_02_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Networking_Client {
	public static void main(String[] args) {
	
		Socket s = null;
		
		try {
			s = new Socket();
			System.out.println("연결요청");
			
			s.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결성공");
			
			byte[] b = null;
			String msg = null;
			
			OutputStream os = s.getOutputStream();
			
			msg = "Hi Server";
			
			b = msg.getBytes("UTF-8");
			
			os.write(b);
			System.out.println("보내기 성공");
			
			InputStream in = s.getInputStream();
			b = new byte[100];
			int r = in.read(b);
			
			msg = new String(b, 0, r, "UTF-8");
			
			System.out.println("받기 성공");
			
			in.close();
			os.close();
			s.close();
			
		} catch(Exception e) {}
	
	}
}