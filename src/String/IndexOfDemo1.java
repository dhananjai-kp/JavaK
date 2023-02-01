package String;

public class IndexOfDemo1 {
	public static void main(String[] args) {
		String str = "Dhananjai Kuamr pandey";

		int i1 = str.indexOf("a");
		System.out.println(i1);

		System.out.println(str.indexOf("na"));
		
		System.out.println(str.indexOf("n",10));
	}

}
