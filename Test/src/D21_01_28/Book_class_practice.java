package D21_01_28;

class Book {
	String name;
	int price;
	Book(String name) {
		this(name, 40000);
	}
	Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void title() {
		System.out.println(name + " " + price);
	}
}

public class Book_class_practice {

	public static void main(String[] args) {
		
		Book b1 = new Book("자바");
		b1.title();
		Book b2 = new Book("파이썬", 30000);
		b2.title();
		
	}
}