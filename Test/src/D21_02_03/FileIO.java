package D21_02_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		
		BufferedWriter out = null;
		BufferedReader in = null;
		
		ServerSocket ser = null;
		Socket so = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			ser = new ServerSocket(9999);
		} catch(Exception e) {}
		System.out.println("연결 기다림.");
		
		try {
			so = ser.accept();
		} catch(Exception e) {}
		
		System.out.println("기다림..");
		
		try {
			out = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(so.getInputStream()));
			
			while(true) {
				String msg = in.readLine();
				if(msg.equals("stop")) {
					System.out.println("종료");
					break;
				}
				System.out.println("보내기");
				String outmsg = sc.nextLine();
				out.write(outmsg + "\n");
				out.flush();
			}
		} catch(Exception e) {
		} finally {
			try {
				sc.close();
				so.close();
				ser.close();
			} catch(Exception e) {}
		}
		
		
	}
}