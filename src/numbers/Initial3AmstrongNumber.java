package numbers;

public class Initial3AmstrongNumber {
	public static void main(String []arg) {
		int n=1;
		int cube=0,a,count=1;
		int num=n;
		while(count>=3)
{
			
		while(num>0)
		{
			a=num%10;
			num=num/10;
			cube=cube+a*a*a;
		}
		if (n==cube)
			{
			System.out.println("Armstrong number :"+n);
			count++;
			}
		
		else
			System.out.println("Not an Armstrong number :"+n);
		
	}
		n++;
}


}
