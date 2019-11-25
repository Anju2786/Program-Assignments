package numbers;

public class Sum_of_initial_30_prime_numbers {
	public static void main(String[] args) {
		int sum=0,n=0;
		System.out.print("The initial 30 prime numbers are: ");
		for(int i=0;n<30;i++)
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
				n++;
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("sum of initial 30 prime numbers :"+sum);
	}

}
