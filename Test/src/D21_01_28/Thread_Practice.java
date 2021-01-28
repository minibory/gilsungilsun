package D21_01_28;

class MovieThread extends Thread {
	public void run() {
		for(int i = 0; i<3;i++) {
			System.out.println("영화를 재생합니다.");
		}
	}
}
class MusicThread extends Thread {
	public void run() {
		for(int i = 0; i<3;i++) {
			System.out.println("음악를 재생합니다.");
		}
	}
}

public class Thread_Practice {
	public static void main(String[] args) {
		
		Thread th1 = new MovieThread();
		th1.start();
		Thread th2 = new Thread(new MusicThread());
		th2.start();
		
	}
}