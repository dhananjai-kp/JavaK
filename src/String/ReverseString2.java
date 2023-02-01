package String;

public class ReverseString2 {
	String reverse1 = "";

	public void reverse(String str) {
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			for (int j = str1[i].length() - 1; j >= 0; j--) {
				char a = str1[i].charAt(j);
				reverse1 = reverse1 + a;
			}
			reverse1 = reverse1 + " ";
		}
		System.out.println(reverse1);
	}

	public static void main(String[] args) {
		ReverseString2 obj = new ReverseString2();
		obj.reverse("Dhananjai Kumar Pandey");
	}
}