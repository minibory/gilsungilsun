interface Person {
	String work();
}
class Worker1 implements Person {

	public String work() {
		return "���Ѵ�.";
	}
}
class Student implements Person {
	
	public String work() {
		return "�����Ѵ�.";
	}
}

public class Metter {
	
	static void pr(Person p) {
		System.out.println(p.work());
	}
	
	public static void main(String[] args) {
		
		pr(new Worker1());
		pr(new Student());
		
		
	}
}