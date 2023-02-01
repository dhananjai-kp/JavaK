package JavaBasics;

public class ObjectDemo1 {
	int i;
	int j;
	
	public ObjectDemo1(int a, int b) {
		i = a;
		j = b;
	}
	

	public static void main(String[] args) {
		ObjectDemo1 obj1 = new ObjectDemo1(5,10);
		
		System.out.println(obj1.i+" "+ obj1.j);
	}
}
