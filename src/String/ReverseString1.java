package String;

public class ReverseString1 {

	public void reverse(String str) {
		String[] str1 = str.split(" ");
		
		for (int i = str1.length - 1; i >= 0; i--) {
			System.out.print(str1[i] + " ");
		}
	}
	public static void main(String[] args) {
		ReverseString1 obj = new ReverseString1();
		obj.reverse("Kaustav Ghosh");
	}
}