package String;

import java.util.Scanner;

public class StringReverse {
	static String reverse = "";

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		for (int i = name.length() - 1; i >= 0; i--) {
			char a = name.charAt(i);
			reverse = reverse + a;
		}
		System.out.println(reverse);
	}
}
