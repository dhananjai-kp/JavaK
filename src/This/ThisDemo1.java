package This;

public class ThisDemo1 {

	ThisDemo1(){
		System.out.println("First");
	}
	ThisDemo1(int x){	
	}
void display() {System.out.println("Dhananjai");}

public static void main(String[] args) {
	ThisDemo1 a = new ThisDemo1();
	a.display();
}
 
}