// Factorial using while loop
package LoopsPractice;

public class WhileDemo2 {

	static void factorial() {
        int x= 10  ;
        int factorial;
        int i=0;
         
        while(i<=x) {
            factorial = factorial*i;
            i++;
        }
         
        System.out.println("Factorial of "+x+" is : "+factorial);
    }
	public static void main(String[] args) {
	factorial();
}

}
