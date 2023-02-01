package SwitchCasePractice;
public class JobResponsibility {
	static void courseVSresponsibility() {
		String responsibility = null;
		String course = "developement";
		
		switch (course) {
		
		case "softwareTesting":
			responsibility = "test";
			break;
		case "developement":
			responsibility = "develop";
			break;
			
		default:
		//	responsibility = "no_responsibility";
			System.out.println("Wrong course Input");
		}
		
		if (responsibility.equalsIgnoreCase("test") ) {
			test1();
		}
		else if (responsibility.equalsIgnoreCase("develop")) {
			deveop1();
		}
		
	}

	static void test1() {
		System.out.println("Will have to test everything developed by the developer");
	}
	static void deveop1() {
		System.out.println("Will have to develop teh software and fix the bugs.");
	}

	public static void main(String[] args) {
		courseVSresponsibility();
	}
}
