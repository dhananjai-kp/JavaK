package JavaConstructor;
import java.util.Scanner;

public class Prime {

	public void primeMethod(int x) {

		for (int i = 2; i <= x; i++) {

			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(i + " ");
			}

		}
	}
	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = ob.nextInt();
		
		Prime object = new Prime();
		object.primeMethod(num);
	}
}
