package JavaConstructor;

public class Holiday {
	String name;
	String month;
	int day;

	public Holiday(String n, String m, int d) {
		name = n;
		month = m;
		day = d;	
	}
	
	public Holiday(Holiday h) {
		name = h.name;
		month = h.month;
		day = h.day;
	}
	
	
	
	
	
	
//	public boolean inSameMonth (Holiday h) {
	
		
		
//	}
	
	public static void main(String[] args) {
	
		Holiday h1 = new Holiday();
		Holiday h2 = new Holiday();
		h1.day = 1
		
		
		
		
		Holiday holiday1 = new Holiday("Independance Day", "July", 4);
	System.out.println(holiday1.name+holiday1.month+holiday1.day);
	}
	
	
}
