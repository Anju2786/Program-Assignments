package numbers;

public class FibonacciSeries {
	public static void main(String []arg) {
		int a=0;
		int b=1;
		int i=1;
		System.out.print("Fibonacci series "+a+" "+b+" ");
		int c;
		do {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
			
			for(int j=2;j<=c;j++)
			{
				if(c%j==0)
					System.out.print("prime num "+c+" ");
			}
			
		}
		while(i<10);
			
		
	}

}
