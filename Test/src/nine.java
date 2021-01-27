
public class nine {

	public static void main(String[] args) {
		String str = "공부는 어렵지만, 재밌네요";
		String[] str2;
		str2 = str.split(",");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		System.out.println(str.charAt(6));
		System.out.println(str.substring(0, 3));
	}
}