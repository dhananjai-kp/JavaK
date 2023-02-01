package String;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	
	String str = "Dhananjai Kumar pandey";
	
	char ch[] = str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if (ch[i]==' ') {
			ch[i] = '\0';
		}
	}
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	}
}
}
