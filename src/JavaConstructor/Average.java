package JavaConstructor;

public class Average {
	int a,b,c,d;
	static int averageMethod(int i,int j ,int k, int l) {
		int avg;
		avg = (i+j+k+l)/4;
		return avg;
	}
	
	Average t1 = new Average();
	
	public static void main(String[] args) {
		System.out.println(t1.averageMethod(10,20,30,40));
	
}
	
}