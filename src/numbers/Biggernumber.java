package numbers;

import java.util.Scanner;

public class Biggernumber {
	public static void main(String [] arg) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		s1.close();
		if(a>b)
			System.out.println("Bigger number is:"+a);
		else
			System.out.println("Bigger number is:"+b);
	}

}
