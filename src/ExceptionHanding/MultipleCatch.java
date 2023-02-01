package ExceptionHanding;

import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {

		try {
			int a[] = {4};
			System.out.println(a[1]);
		} catch (NullPointerException e) {
			System.out.println("Your Array is Null");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("your index is out of bound");
		} catch (Exception e) {
			System.out.println("Something else is Wrong");
		}
	}
}
