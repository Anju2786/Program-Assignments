package numbers;

import java.util.Scanner;

public class Given2NumAreAnagramOrNot {
	public static void main (String[] args)  
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number want to check whether anagram or not:");
		String x=sc.nextLine();
		System.out.println("Enter the another number want to check whether anagram or not:");
		String num=sc.nextLine();
		sc.close();
		
		char[]a=x.toCharArray();
		char[]b=num.toCharArray();
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				if(a[i]==b[j])
				{
					b[j]=' ';
					break;
				}
		   }
	    }
		int k=0;
		for(k=0;k<b.length;k++)
		{
			if(b[k]!=' ')
			{
				System.out.println("Numbers are not anagram:");
			   break;
			}
		}
		if(k==b.length)
			System.out.println("Numbers "+x+" and "+num+" are anagram:");
	}

}
