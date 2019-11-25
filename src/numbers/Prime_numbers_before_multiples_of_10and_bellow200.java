package numbers;

public class Prime_numbers_before_multiples_of_10and_bellow200 {
	public static void main(String[] args) {
	System.out.println("All the prime numbers  which are immediately before multiples of 10 and bellow 200 :");
	int x=2;
	for(int i=10;i<=200;i--)
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
			i=10*x;
			x++;
         }

    }
	System.out.println();

}
}
