package numbers;

import java.util.Scanner;

public class Move1stHalfTo2ndHalf {
	public static void main (String[] args)  
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number Which you want to move1st half to 2nd half:");
	String x=sc.nextLine();
	sc.close();
	char[]a=x.toCharArray();
	int i,j;
	for( i=(a.length)/2;i<=a.length-1;i++)
	{
		System.out.print(a[i]);
	}
	
	for( j=0;j<=(a.length-1)/2;j++)
	{
		System.out.print(a[j]);
	}

}
}
