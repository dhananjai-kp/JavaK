package String;

public class Test {
public static void main(String[] args) {
	try {
		int a = 5/0;
		System.out.println(a);
	} catch (Exception e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.out.println("Hey, We can also run the program flawlessly");
	}
}

}
