package numbers;

public class PrimeNumberInReverseOrder70to20 {
	public static void main(String[] args) {
		System.out.println("All the prime numbers between 70 and 20 in revrse order :");
		
		for(int i=70;i>=20;i--)
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
				
	         }
	
        }
	}
}

