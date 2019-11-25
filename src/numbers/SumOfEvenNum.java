package numbers;

public class SumOfEvenNum {
	public static void main (String[] args) {
		int a[]= {2,3,9,8,47,48};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				sum=sum+a[i];
				
		}
		System.out.print("Sum of even num "+sum);
	}

}
