package numbers;

public class SumOfAllDigitsOfGivenNum {
	public static void main(String[]arg) {
		int num=4586;
		int sum=0;
		int a[]=new int[5];
		for( int i=0;i<a.length;i++)
		{
			
			sum=sum+num%10;
			num/=10;
		}
		System.out.println("sum of all digit is:"+sum);
		
	}

}
