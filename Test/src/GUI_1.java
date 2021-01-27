class Total {
	int sum;

	Total() {
		sum = 0;
	}
	void total(int n) {
		sum += n;
	}
	int get() {
		return sum;
	}
}

class AThread extends Thread {
	Total t;
	int a, b;

	AThread(Total t, int a, int b) {
		this.t = t;
		this.a = a;
		this.b = b;
	}

	public void run() {
		t.sum = 0;
		try {
			for (int i = a; i <= b; i++) {
				t.total(i);
			}
			System.out.println(t.get());
		} catch(Exception e) {
			
		}
	}
}

public class GUI_1 {
	public static void main(String[] args) throws InterruptedException {

		Total t = new Total();
		AThread a = new AThread(t, 1, 50);
		AThread b = new AThread(t, 51, 100);
		
		try {
			a.start();
			Thread.sleep(1000);
			b.start();
		} catch(Exception e) {
		}
		

//		Thread th1 = new Thread(a);
//		Thread th2 = new Thread(b);
//		th1.start();
//		th2.start();
	}
}