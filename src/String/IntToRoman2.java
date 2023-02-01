package String;
public class IntToRoman2 {
	 public static void intRoman(int num) {
		 if (num >= 1 | num <= 3999) 
	{
		 int a = num/1000; 		 num = num%1000;		for (int i = 0; i <a ; i++) {System.out.print("M");}
		 if (num >= 900) {System.out.print("CM");	num = num-900;}		

		 int b = num/500; 		 num = num%500;			for (int i = 0; i <b ; i++) {System.out.print("D");}
		 if (num >= 400) {System.out.print("CD");	num = num-400;}		

		 int c = num/100; 		 num = num%100;			for (int i = 0; i <c ; i++) {System.out.print("C");}
		 if (num >= 90) {System.out.print("XC");	num = num-90;}		

		 int d = num/50; 		 num = num%50;			for (int i = 0; i <d ; i++) {System.out.print("L");}
		 if (num >= 40) {System.out.print("XL");	num = num-40;}		

		 int e = num/10; 		 num = num%10;			for (int i = 0; i <e ; i++) {System.out.print("X");}
		 if (num >= 9) {System.out.print("IX");		num = num-9;}		

		 int f = num/5; 		 num = num%5;			for (int i = 0; i <f ; i++) {System.out.print("V");}
		 if (num >= 4) {System.out.print("IV");		num = num-4;}		

		 int g = num/1; 		 						for (int i = 0; i <g ; i++) {System.out.print("I");}
	}
		 else {System.out.println("Invalid Number");}			 
}	 
	
	 public static void main(String[] args) {intRoman(3994);}
}
