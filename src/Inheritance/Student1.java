package Inheritance;

public class Student1 extends Teacher {
	public static void main(String[] args) {
		reading();
		writing();
		
		Teacher t1 = new Teacher();
		System.out.println(t1);
		
		Teacher t2 = new Teacher(10);
		System.out.println(t2);
		
	}
	
}
