package numbers;

import java.util.Scanner;

public class PrintMiddleNum {
	public static void main(String [] arg) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		s1.close();
		// Checking for b 
        if ((a < b && b < c) || (c < b && b < a)) 
        	System.out.println("Middle no is:"+b); 
  
        // Checking for a 
        else if ((b < a && a < c) || (c < a && a < b)) 
        	System.out.println("Middle no is:"+a);  
  
        else
        	System.out.println("Middle no is:"+c); 
	}

}
