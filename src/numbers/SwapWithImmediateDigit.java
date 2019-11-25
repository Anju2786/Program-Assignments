package numbers;

import java.util.Scanner;

public class SwapWithImmediateDigit {
	public static void main (String[] args)  
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("every digit swap with immediate digit");
	String x=sc.nextLine();
	sc.close();
	char[]a=x.toCharArray();
	int i,j;
	for( i=0;i<a.length-1;i=i+2)
	{
	if(i%2==0)
		{
		
	j=i+1;
		char temp;
		temp=a[i];
          a[i]=a[j];
	     a[j]=temp;
		
		}
	}

		for(int k=0;k<a.length;k=k+1)
		{
				System.out.print(a[k]);
		}
     }
		
 }




