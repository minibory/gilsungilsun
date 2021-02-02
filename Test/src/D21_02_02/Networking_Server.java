package D21_02_02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Networking_Server {
	public static void main(String[] args) {
		
		ServerSocket ser = null;
		
		try {
			ser = new ServerSocket();
			ser.bind(new InetSocketAddress("localhost", 5001));
			
			while(true) {
				System.out.println("연결 되기를 기다림.");
				Socket so = ser.accept();
				
				InetSocketAddress is = (InetSocketAddress)so.getRemoteSocketAddress();
				
				byte[] b = null;
				String msg = null;
				
				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read(b);
				
				msg = new String(b, 0, r, "UTF-8");
				//////////////////////////////////////
				
				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				b = msg.getBytes("UTF-8");
				
				os.write(b);
				
				os.close();
				in.close();
				so.close();
				ser.close();
			}
		} catch(Exception e) {}
	}
}