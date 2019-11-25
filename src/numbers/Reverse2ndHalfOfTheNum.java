package numbers;

import java.util.Scanner;

public class Reverse2ndHalfOfTheNum {
	public static void main(String []arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the num ");
		String x=sc.nextLine();
		sc.close();
		char[] a=x.toCharArray();
		int i,j;
		for(i=0;i<=(a.length-1)/2;i++)
		{
			System.out.print(a[i]);
		}
		for(j=a.length-1;j>(a.length-1)/2;j--)
		{
			System.out.print(a[j]);
		}
	}

}
