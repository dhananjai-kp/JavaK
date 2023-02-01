package String;

import java.util.Scanner;

public class ContainsDemo {

	public static void main(String[] args) {

		String str = "Dhananjai Kumar ";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value");
		String str1 = sc.nextLine();

		if (str.contains(str1)) {
			System.out.println("Its part of my name");
		}

		else {
			System.out.println("Itsnot part of my name");
		}

	}
}
