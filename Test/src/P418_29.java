class Pet {
	private String type;
	private int bir;
	static int cnt = 0;
	
	Pet(String type, int bir) {
		this.type = type;
		this.bir = bir;
		cnt++;
	}

	void move() {
		System.out.println(type + "이/가 웁직입니다.");
	}
	void birth() {
		System.out.println(type + "은/는 " + bir + "개월입니다.");
	}
}

public class P418_29 {
	public static void main(String[] args) {
		
		Pet dog = new Pet("강아지", 8);
		Pet cat = new Pet("고양이", 13);
		
		dog.move();
		cat.move();
		dog.birth();
		cat.birth();
		System.out.println("현재 우리집 애완동물 수는 " + Pet.cnt + "마리 입니다.");
	}
}