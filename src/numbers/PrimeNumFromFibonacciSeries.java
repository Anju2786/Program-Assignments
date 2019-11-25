package numbers;

public class PrimeNumFromFibonacciSeries {
	public static void main (String[] args)  
	{ 
	    System.out.println("Prime numbers  from the Fibonacci series :");
	    int a=0,b=1,c=a+b;
	    for(int i=2;c<5000;i++) {
	    	int count =0;
	    	a=b;
	    	b=c;
	    	c=a+b;
	    	
	    	for(int j=1;j<=c;j++)
	    	{
	    		if(c%j==0)
	    			count++;
	    	}
	    	if(count==2)
	    		System.out.print(c+" ");
	    }
	}
}


