package numbers;



public class Initial20PrimeNum {
	public static void main(String[] args) {
		int n=0;
		System.out.print("The initial 20 prime numbers are: ");
		for(int i=0;n<20;i++)
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
				
			}
			
		}
		
}
}
