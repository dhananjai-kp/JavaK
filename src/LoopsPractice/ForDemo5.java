//Write a program to find the factorial  of a number.

package LoopsPractice;
public class ForDemo5 {
	static void factorial(){
		int x = 5;
		int factorial ;
		for(int i=1; i<=x; i++) {
			factorial = i* factorial;
		}
		System.out.println(factorial);
					
		
	}
	
	public static void main(String[] args) {
		factorial();
	}
}
