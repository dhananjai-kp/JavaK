package String;

public class ReverseString3 {

	public static void main(String[] args) {
		String name = "Dhananjai Kumar Pandey";
		String[] str1 =name.split(" ");
		
		for (int i = str1.length-1; i >= 0; i--) {
			System.out.print(str1[i]+" ");
		}
	}
}