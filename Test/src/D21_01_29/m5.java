package D21_01_29;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class St<T> {
	int n;
	Object[] obj;
	St() {
		n = 0;
		obj = new Object[3];
	}
	void push(T t) {
		if(n == 3) {
			return;
		} else {
			obj[n] = t;
			n++;
		}
	}
	T pop() {
		if(n == 0) {
			return null;
		} else {
			n--;
			return (T)obj[n];
		}
	}
}

public class m5 {
	public static void main(String[] args) throws Exception {
		
		St<String> str = new St<String>();
		
		str.push("재경");
		str.push("용현");
		str.push("지선");
		
		for(int i=0;i<3;i++) {
			System.out.println(str.pop());
		}
		
		St<Integer> str1 = new St<Integer>();
		str1.push(4);
		str1.push(7);
		str1.push(6);
		
		for(int i=0;i<3;i++) {
			System.out.println(str1.pop());
		}
		
		
	}
}