package String;
public class IntToRoman3 {
	 public static void intRoman(int num) {
		 if (num >= 1 | num <= 3999) 
	{
		int int1[] = {1000, 500, 100, 50, 10, 5};
		int int2[] = {900, 400, 90, 40, 9, 4};
		String str1[] = {"M", "D","C", "L", "X", "V" };
		String str2[] = {"CM", "CD","XC", "XL", "IX", "IV" };
			 
		for (int i = 0; i < 6; i++) 
		{
			int a = num/int1[i];
			num = num%int1[i];
			for (int j = 0; j < a; j++) {System.out.print(str1[i]);}
			if(num >=int2[i]) {System.out.print(str2[i]);		num = num-int2[i];}
		}
		 	int g = num/1; 		 						
		 	for (int i = 0; i <g ; i++) {System.out.print("I");}
	}
		 else {System.out.println("Invalid Number");}			 
}	 
	 public static void main(String[] args) {intRoman(3843);}
}
