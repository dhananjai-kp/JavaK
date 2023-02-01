//Write a program to find the value of one number raised to the power of another

package LoopsPractice;
public class ForDemo6 {
	static void power(){
		int x=2;
		int y=3;
		int pwr;
		for(int i=1; i<=y; i++) {
			pwr = x*pwr;
		}
		System.out.println(pwr);	
	}
	
	public static void main(String[] args) {
		power();
	}
}
