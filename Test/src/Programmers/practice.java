package Programmers;

public class practice{
	public static void main(String[] args) {
		String str = "ImIronMan";
		String str2 = "";
		str2 = str.toLowerCase();
		char c;
		for(int i = 0; i < str2.length();i++) {
			c = str2.charAt(i);
			if((97 <= c && c <= 122) == false) {
				str2 = str2.substring();
			}
		}
		
	}
}