package numbers;

import java.util.Scanner;

public class SumOfSquareOf2numIs3rdnum {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the numbers:");
		 int a=s.nextInt();
		 int b=s.nextInt();
		 int c=s.nextInt();
		 s.close();
		 int A=a*a;
		 int B=b*b;
		 int C=c*c;
		 
		 if(c==A+B||b==C+A||a==B+C)
			 System.out.println("True");
		 
		 else
			 System.out.println("False");
			 
		
	}

}
