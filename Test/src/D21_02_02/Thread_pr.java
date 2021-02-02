package D21_02_02;

class Th implements Runnable {

	public void run() {
		try {
			Thread.sleep(10000);
			System.exit(0);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class Thread_pr {
	public static void main(String[] args) {

		Th t = new Th();
		
		Thread th = new Thread(t);
		
		th.start();
	}
}