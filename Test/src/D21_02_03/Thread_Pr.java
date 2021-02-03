package D21_02_03;

class Sh {
	private int num = 0;
	public void add() {
		int n = num;
		Thread.yield();
		n += 10;
		num = n;
		System.out.println(num);
	}
}
class Student extends Thread {
	String name;
	Sh sh;
	Student(String name, Sh sh) {
		this.name = name;
		this.sh = sh;
	}
	public void run() {
		while(true) {
			try {
				sh.add();
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}

public class Thread_Pr {
	public static void main(String[] args) throws Exception {
		
		Sh sh = new Sh();
		Student th1 = new Student("jack", sh);
		Student th2 = new Student("tom", sh);
		th1.start();
		th1.join();
		th2.start();
		th2.join();
		
	}
}