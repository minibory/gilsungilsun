package D21_02_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Socket so = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			so = new Socket("localhost", 9999);
			
			in = new BufferedReader(new InputStreamReader(so.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			
			while(true) {
				System.out.println("º¸³»±â");
				String outmsg = sc.nextLine();
				if(outmsg.equalsIgnoreCase("stop")) {
					out.write(outmsg + "\n");
					out.flush();
					break;
				}
				out.write(outmsg + "\n");
				out.flush();
				
				String msg = in.readLine();
				System.out.println(msg);
				
			}
		} catch(Exception e) {}
		sc.close();
		so.close();
	}
}