package D21_01_29;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_practice2 {
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		h.put("j", "123");
		h.put("d", "234");
		h.put("t", "345");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id, pw입력해라");
			String id = sc.next();
			String pw = sc.next();
			if(!h.containsKey(id)) {
				System.out.println("id가 존재하지 않네요");
				continue;
			} else {
				if(!h.get(id).equals(pw)) {
					System.out.println("비밀번호가 틀려요");
				} else {
					System.out.println("로그인");
					break;
				}
			}
		}
		
	}

}
