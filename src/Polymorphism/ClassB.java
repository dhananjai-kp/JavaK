package Polymorphism;

public class ClassB extends ClassA {
	void display() {
		System.out.println("ClassB");
	}
	
	public static void main(String[] args) {
		ClassA obj = new ClassB();
		obj.display();
	}

	
}
