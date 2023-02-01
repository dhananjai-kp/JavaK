package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String a = "Dhanan";
	String b = "Nadhan";
	
	a = a.toLowerCase();
	b = b.toLowerCase();
	
	if (a.length()!= b.length()) {
		System.out.println("Not Anagram");
	}
	else {
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if (Arrays.equals(a1, b1)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
		
		
		
		
		
		
		
		
		
	}
	
}
}
