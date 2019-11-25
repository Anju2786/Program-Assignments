package numbers;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String []arg) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=s1.nextInt();
		s1.close();
		int i=2;
		while(i<num)
		{
			if(num%i==0)
				break;
			i++;
		}
		if(i==num)
		System.out.println("prime number : "+num);
      
		else
			System.out.println("not a prime number : "+num);
}

}