package ExceptionHanding;

public class FinallyDemo {
	public static void main(String[] args) {
		try {
			int a = 25/5;
			System.out.println(a);	
			} 
		catch (NullPointerException e) 
			{
			System.out.println(e);
			}
		
		finally {System.out.println("Finally Block Excuted");}
		
		System.out.println("Rest of the Code");
	}
}
