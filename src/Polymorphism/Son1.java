package Polymorphism;

public class Son1 extends Father  {
	public void property() {
		System.out.println("Son1's Property");
	}
	
	public static void main(String[] args) {
		Father obj2 = new Son1();
		Father obj1 = new Father();
		
		System.out.println(obj1.property());		
		System.out.println(obj2.property());
	}
}
