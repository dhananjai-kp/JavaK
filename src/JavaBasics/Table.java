package JavaBasics;

import java.util.*;

public class Table {
    
    public static void main(String[] args) {
        int num; 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = s.nextInt();
        
                
        for(int i=1; i<11; i++){
            System.out.println(num+" x " + i + " = " + num*i  );
        }
        
}
}