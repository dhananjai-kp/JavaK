package JavaBasics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		int r, sum = 0, temp;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = obj.nextInt();

		// int n=454;//It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}