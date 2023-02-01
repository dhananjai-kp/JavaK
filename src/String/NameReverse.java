package String;

public class NameReverse {
	public static void main(String[] args) {
		String name = "Dhananjai Kumar Pandey";
		String[] name1 = name.split(" ");
		for (int i = 0; i <=name1.length-1; i++) {
			for (int j = name1[i].length()-1; j >=0 ; j--) {
				System.out.print(name1[i].charAt(j));
			}
			System.out.print(" ");
			
		}
	}
}