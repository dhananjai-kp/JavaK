package JavaBasics;
import java.util.Scanner;

public class Fibonacci {
	public static void fibMethod(int count) {
		int n1= 0, n2 = 1, n3;
		for (int i = 0; i<count; i++) {
			n3 = n1+n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}	
	}
	
public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int num = obj.nextInt();

	//Fibonacci f1 = new Fibonacci ();

	Fibonacci.fibMethod(num);
	
}
}
