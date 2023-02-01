package JavaBasics;

import java.util.Scanner;

public class Palindrome1 {

	public void palMethod(int x) {
		int r, temp, sum = 0;
		temp = x;
		while (x > 0) {
			r = x % 10;
			sum = (sum * 10) + r;
			x = x / 10;
		}
		if (temp == sum)
			System.out.println("Its a palindrome number ");
		else
			System.out.println("Its not a not palindrome");
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = obj.nextInt();
		
		Palindrome1 object = new Palindrome1();
		object.palMethod(n);
	}

}
