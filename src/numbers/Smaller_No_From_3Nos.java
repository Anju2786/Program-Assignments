package numbers;

import java.util.Scanner;

public class Smaller_No_From_3Nos {
	public static void main(String [] arg) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		s1.close();
		if(a>b)
		{
	       if(b>c)
				System.out.println("smaller number is:"+c);
	       else
	    	   System.out.println("smaller number is:"+b);
			
		}
		else
			 System.out.println("smaller number is:"+a);	
	}


}
