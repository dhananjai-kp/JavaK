package JavaConstructor;

import java.util.Scanner;

public class Fact {

	public void factorialmethod(int x) {
		
		int i, fact = 1;
		// it is the number to calculate factorial
		for (i=1;i<=x;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+x+" is = "+ fact );
	}

	public static void main(String[] args) {
		
		Fact object = new Fact();
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Your Series : ");
		int num = ob.nextInt();
		
		for (int i =0; i<=num; i++) { 
			object.factorialmethod(i);
		}
		}
}