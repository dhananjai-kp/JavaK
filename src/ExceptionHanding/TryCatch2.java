package ExceptionHanding;

import java.util.Scanner;

public class TryCatch2 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Give a number: ");
		
		try {
			int n = scan.nextInt();
			System.out.println(n);
			
		} catch(Exception e) {
			System.out.println("!!! Please Enter a number only !!!");
		}
		
	}
	
}
