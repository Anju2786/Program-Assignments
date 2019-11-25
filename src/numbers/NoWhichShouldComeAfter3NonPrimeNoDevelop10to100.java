package numbers;

public class NoWhichShouldComeAfter3NonPrimeNoDevelop10to100 {
	public static void main (String[] args) {
		
		System.out.print("numbers which should come after 3 non prime numbers, Develop between 10 to 100. :");
		
		for(int i=10; i<=100; i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					break;
				else
					count++;
			
			if(count==3)
			{
								
				System.out.print(i+" ");
				
	         }
			
	    }
		
		System.out.println();
	}
	}
}


