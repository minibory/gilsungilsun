package D21_01_29;

public class Generics_practice {

	static <T> void show(T[] a) {
		for(int i = 0 ; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		String[] str = new String[] { "�ȳ�", "�ڹ�", "�ָ�" };

		show(str);

	}
}