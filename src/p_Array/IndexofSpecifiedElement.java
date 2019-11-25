package p_Array;

import java.util.Scanner;

public class IndexofSpecifiedElement {
	public static void main(String []arg) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the element");
		int x=s1.nextInt();
		s1.close();
		
		int array[]= {20,50,30,10,80,90};
		
		for(int i=0;i<array.length;i++)
		{
			if(x==array[i])
				System.out.println(i);
		}
		
		
	}
	}
