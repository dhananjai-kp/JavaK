package ExceptionHanding;

import java.util.Scanner;

public class TryCatch3 {
	public static void main(String[] args) {

		try {
	int a[]  = null;
	System.out.println(a[1]);
		}
		catch (NullPointerException e) {
			System.out.println("Your Array is Null");
		}
		
	}
	
}
