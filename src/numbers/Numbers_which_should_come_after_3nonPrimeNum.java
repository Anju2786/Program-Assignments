package numbers;

public class Numbers_which_should_come_after_3nonPrimeNum {
	public static void main(String[]args) {
		System.out.println(" numbers which should come after 3 non prime numbers between 10 to 100:");
		int num=0;
		
		for(int i=10;i<100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
				
				}
			if(count!=2)
				num++;
			if (count!=2 && num%4==0)
				System.out.print(i+" ");
		}
	}

}
