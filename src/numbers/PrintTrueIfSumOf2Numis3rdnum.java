package numbers;

import java.util.Scanner;

public class PrintTrueIfSumOf2Numis3rdnum {
	 public static void main (String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the numbers:");
		 int a=s.nextInt();
		 int b=s.nextInt();
		 int c=s.nextInt();
		 s.close();
		 if(c==a+b)
			 System.out.println("true");
		 else
			 System.out.println("false");
			 
	 }
	

}
