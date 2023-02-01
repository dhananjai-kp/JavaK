package ExceptionHanding;

public class TryCatch1 {
	public static void main(String[] args) {
		try {
		   int[] a = {1,2,4,5};
		   System.out.println(a[4]);
		} catch(Exception e ) {
			System.out.println("!!! Exception !!!");
		}
		
		
		
	}
	
}
