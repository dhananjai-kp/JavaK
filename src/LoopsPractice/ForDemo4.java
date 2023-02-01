//Write a program to print the multiplication table of that number. 

package LoopsPractice;
public class ForDemo4 {
	
	static void multiTable() {
		int x = 5;
		for (int i=1; i>=10; i++) {
			System.out.println(x +" x "+ i +" = "+ x*i);
		}
	}
	public static void main(String[] args) {
	
		multiTable();
	}	
}