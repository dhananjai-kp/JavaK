package String;

import java.util.Iterator;

public class IntToRoman {

	 public static void intRoman(int num) {
		
		 int a = num/1000; 		 num = num%1000;
		 if (num >= 900) {num = num-900; int h = 1;} else {int h = 0;}
		 
		 int b = num/500;		 num = num%500;
		 if (num >= 400) {num = num-400; int n = 1;} else {int n=0;}

		 
		 int c =num/100;		 num = num%100;
		 if (num >= 90) {num = num-90; int j = 1;} else {int j = 0;}
		 
		 int d = num/50;		 num = num%50;
		 if (num >= 40) {num = num-40; int k = 1;} else {int k = 0;}

		 int e = num/10;		num = num%10;
		 if (num >= 9) {num = num-9; int l = 1;} else {int l = 0;}
		 
		 int f = num/5;         num = num%5;
		 if (num >= 4) {num = num-4; int m = 1;} else {int m = 0 ;}

		 int g = num/1;
		 num = 0;

			 for (int i = 0; i <a ; i++) {System.out.print("M");}
			 for (int i = 0; i <h; i++) {System.out.print("CM");}
			 for (int i = 0; i <b ; i++) {System.out.print("D");}
			 for (int i = 0; i <n ; i++) {System.out.print("CD");}
			 for (int i = 0; i <c ; i++) {System.out.print("C");}
			 for (int i = 0; i <j ; i++) {System.out.print("XC");}
			 for (int i = 0; i <d ; i++) {System.out.print("L");}
			 for (int i = 0; i <k ; i++) {System.out.print("XL");}
			 for (int i = 0; i <e ; i++) {System.out.print("X");}
			 for (int i = 0; i <l ; i++) {System.out.print("IX");}
			 for (int i = 0; i <f ; i++) {System.out.print("V");}
			 for (int i = 0; i <m ; i++) {System.out.print("IV");}
			 for (int i = 0; i <g ; i++) {System.out.print("I");}
	}

	public static void main(String[] args) {
		
		IntToRoman obj = new IntToRoman();
		obj.intRoman(2901);
	
	}
}
