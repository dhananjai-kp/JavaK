//Write a program to print the perimeter of a triangle having sides of 3, 4 and 5 units 
//by creating a class named 'Triangle' without any parameter in its constructor.

package JavaConstructor;

public class Triangle {
	int a,b,c;
	int perimeter(int i,int j ,int k) {
		int pm;
		pm = i+j+k;
		return pm;
	}
	
	public Triangle(){
		
	}
	
	public Triangle(int a, int b){
		
	}
		
	public Triangle(int a, int b, int c){
		
	}
	
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(20,30);
		Triangle t3 = new Triangle(11,12,13);
		System.out.println(t1.perimeter(2,3,4));
	
}
	
}
