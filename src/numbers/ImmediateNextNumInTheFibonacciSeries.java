package numbers;

import java.util.Scanner;

public class ImmediateNextNumInTheFibonacciSeries {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the nth term to get the immediate next number");
		int n=sc.nextInt();
		sc.close();
		
		int a[]=new int[n+2];
		int i;
		
		a[0]=0;a[1]=1;
		for(i=2;i<=n;i++)
		{
			a[i]=a[i-1]+a[i-2];
			
			if(i==n) {
				System.out.println(a[i]);
			}
			
		}
		
	}
}
