package numbers;

import java.util.Scanner;

public class Immediate5MultipleOfNum {
	public static void main(String []arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the num ");
		int num=sc.nextInt();
		System.out.println("immediate 5 multiple of");
		
		int prod=1;
		for(int i=1;i<=5;i++)
		{
			prod=i*num;
			System.out.println(i+"*"+num+"= "+prod);
		}
		
	}
	
}
