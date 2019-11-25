package numbers;

public class Initial3Armstrongnum {
	public static void main(String[] args) 
	{
		int num,rem,limit=1, sum = 0;
		System.out.print("Initial 3 Armstrong numbers from 10:");
		for (int i = 10; limit <=3; i++)
		{
			
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.print(i + " ");
				limit++;
			}
			
			sum = 0;
		}

	}

}
