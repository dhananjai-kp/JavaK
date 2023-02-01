/*
Write a program to print the names of students by creating a Student class.If no name is passed 
while creating an object of Student class, then the name should be "Unknown", otherwise the name 
should be equal to the String value passed while creating object of Student class.
 */
package JavaConstructor;

public class Student {
	String name = "Unknown";
	int idNo = 12;
	static int addition(int i, int j ) {
		int result = i+j;
		return result;
	}
	

	
public static void main(String[] args) {
	
	Student shivapriya = new Student();
	
	Student dhananjai = new Student();
	
	System.out.println(dhananjai.addition(4, 5));
	System.out.println(shivapriya.idNo);
	System.out.println(shivapriya.name);
	System.out.println(shivapriya.addition(2, 3));

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	public Student(String s) {
//		name = s;
//	}
//
//	public Student() {
//		name = "Unknown";
//		idNo = 12;
//	}
//	
//	public void method1() {
//		Student s = new Student();
//		s.name = "NNAAMMEE";
//	}

//	public static void main(String[] args) {
//		//Student s = new Student("Dhananjai");
//		Student a = new Student();

//		System.out.println(s.name);
//		System.out.println(a.name);
//		System.out.println(a.idNo);
	}
}
