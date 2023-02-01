package String;

public class CountPunctuation {

public static void main(String[] args) {
	int count = 0;
	String str = "I am , : - Dhan . jai";
	
	for (int i = 0; i<=str.length();i++) {
		if( str.charAt(i) == ":")
		{
			count++;
		}
	}
	System.out.println("The count of punctuations are : "+ count);
}

}
