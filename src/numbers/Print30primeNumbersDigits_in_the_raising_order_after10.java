package numbers;

public class Print30primeNumbersDigits_in_the_raising_order_after10 {
	public static void main (String[] args) {
		int n=0;
		System.out.print("The initial 30 prime numbers which are having digits in the raising order after 10 :");
		
		for(int i=10; n<30; i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				
				int x=i%10;
				int y=(i/10)%10;
				int z=i/100;
			
			if(y<x&& z<y)
			{
				
				System.out.print(i+" ");
				n++;
	         }

	    }
		

	}
		System.out.println();
	}
	}


