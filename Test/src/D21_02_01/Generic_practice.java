package D21_02_01;

class Box<T> {
	T t;
	Box<T> next;
	
	void in(T t) {
		this.t = t;
	}
	T out() {
		return t;
	}
}

public class Generic_practice {
	public static void main(String[] args) {

		Box<Integer> b = new Box<Integer>();
		
		b.in(30);
		
		b.next = new Box<Integer>();
		b.next.in(40);

		b.next.next = new Box<Integer>();
		b.next.next.in(50);
		
		Box<Integer> tmp;
		tmp = b.next;
		System.out.println(tmp.out());
	
	}
}