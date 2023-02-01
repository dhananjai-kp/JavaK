package JavaBasics;

class Student {
	int rollNo;
	String name;
	float fee;

	public Student(int rollNo, String name, float fee) {
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println("The roll no is " + rollNo + "And Name is " + name + " And the fees is " + fee);
	}
}

class This1 {
	public static void main(String[] args) {
		Student st1 = new Student(100, "Dhananjai", 100);
		st1.display();
	}
}