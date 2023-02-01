//Write a program to calculate the sum of first 10 natural number.
package LoopsPractice;

public class ForDemo3 {

	static void sumOfNumbers() {

		int x;
		int y = 0;
		for (x = 0; x <= 10; x++) {
			y = x + y;
		}
		System.out.println("Sum of 10 natural numer is: " + y);
	}

	public static void main(String[] args) {
		sumOfNumbers();
	}
}
