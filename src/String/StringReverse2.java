package String;
public class StringReverse2 {
	
	public static void main(String[] args) {
		String name = "Dhananjai";
		String str = "";
		for (int i = name.length()-1; i >=0 ; i--) {
			char ch = name.charAt(i);
			str = str+ch;
		}
		System.out.println(str);
		
		
	}
}
