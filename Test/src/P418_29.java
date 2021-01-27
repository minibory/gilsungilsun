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
		System.out.println(type + "��/�� �����Դϴ�.");
	}
	void birth() {
		System.out.println(type + "��/�� " + bir + "�����Դϴ�.");
	}
}

public class P418_29 {
	public static void main(String[] args) {
		
		Pet dog = new Pet("������", 8);
		Pet cat = new Pet("�����", 13);
		
		dog.move();
		cat.move();
		dog.birth();
		cat.birth();
		System.out.println("���� �츮�� �ֿϵ��� ���� " + Pet.cnt + "���� �Դϴ�.");
	}
}