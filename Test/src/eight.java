public class eight {

	static String show(String a, int b) {
		String str = "";
		for (int i = 0; i < b; i++) {
			str = str.concat(a);
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(show("$", 10));
	}
}