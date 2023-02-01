package JavaBasics;
import java.util.Arrays;
import java.util.List;

public class AlphaNumSeparator {
public static void main(String[] args) {
	
	String string = "aj2zr5df0z2";
	
	String stringAlpha = string.replaceAll("[^A-Za-z]", "");
	String stringNum = string.replaceAll("[^0-9]", "");
	
	System.out.println("string Alpha = "+stringAlpha);
	System.out.println("string Num = "+stringNum);

}


}
