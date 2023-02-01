package Abstraction;

class Honda extends Bike {
void run() {
	System.out.println("Honda Running");
}

public static void main(String[] args) {
	Bike obj = new Honda();
	obj.run();
}
}