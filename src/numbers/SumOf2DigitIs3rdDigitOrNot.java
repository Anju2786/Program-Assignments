package numbers;

import java.util.Scanner;

public class SumOf2DigitIs3rdDigitOrNot {
	public static void main(String []arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the num ");
		int num=sc.nextInt();
		int sum=0;
		int n,num1;
		num1=num%10;
		n=num/10;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		if(sum==num1)
			System.out.println("sum of 2 digit is equal to 3rd digit");
		else
			System.out.println("sum of 2 digit is not equal to 3rd digit");
	}

}
