package numbers;

import java.util.Scanner;

public class Sum_of_prime_numbers_between_2numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower bound of range ");
		int lb=sc.nextInt();
		System.out.println("Enter the upper bound of range ");
		int ub=sc.nextInt();
		sc.close();
		System.out.println("prime number between "+lb+" and "+ub+" are:");
		int sum=0;
		for(int i=lb;i<ub;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.print(i+" ");
				
				sum=sum+i;
			}
		}
		
		System.out.println();
		System.out.println("sum of all prime numbers between"+lb+" and "+ub+"is :"+sum);
	}
	}


