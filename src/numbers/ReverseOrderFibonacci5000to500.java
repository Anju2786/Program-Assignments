package numbers;

public class ReverseOrderFibonacci5000to500 {
	public static void main (String[] args) {
		int a=0,b=1,c=a+b,count=2;
		for(int i=2;c<5000;i++)
		{
			count++;
			a=b;
			b=c;
			c=a+b;
		
		}
		int x[]=new int[count];
		a=0;b=1;c=a+b;
		x[0]=0;
		x[1]=1;
		System.out.print(" Fibonacci series in reverse order from500 to 500 : ");
		for(int j=2;c<5000;j++)
		{
			x[j]=c;
			a=b;
			b=c;
			c=a+b;
					
		}
		
		for(int k=x.length-1;x[k]>500;k--)
			System.out.print(x[k]+" ");
		
	
		
		
		
	}
}
		
	
		