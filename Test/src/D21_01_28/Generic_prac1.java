package D21_01_28;
class Java {
	String title;
	
	Java(String t) {
		title = t;
	}
	void show() {
		System.out.println(title);
	}
}
class DB {
	int n;
	DB(int n) {
		this.n = n;
	}
	void pr() {
		System.out.println(n);
	}
}
class Program<T> {
	T t;			//모형자 메타몽
	void in(T t) {
		this.t = t;
	}
	T get() {
		return t;
	}
}

public class Generic_prac1 {
	public static void main(String[] args) {
		
		Program<Java> p = new Program<Java>();
		p.in(new Java("java"));		
		Java j = p.get();
		
		Program<DB> d = new Program<DB>();
		d.in(new DB(3));		
		DB b = d.get();
		
		
	}
}