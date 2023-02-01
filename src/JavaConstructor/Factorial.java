package JavaConstructor;

public class Factorial {
	
	public int factMethod(int x) {
		int fact = 1;
		for (int i=x;i>0;i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
		
		
//		int f1= new Factorial().factMethod(5);
//		System.out.println(f1);
	}
	}
	

