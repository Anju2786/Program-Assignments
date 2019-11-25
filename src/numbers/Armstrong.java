package numbers;

public class Armstrong {
	public static void main(String []arg) {
		int n=153;
		int cube=0,a;
		int num=n;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			cube=cube+a*a*a;
		}
		if (n==cube)
			System.out.println("Armstrong number :"+n);
		else
			System.out.println("Not an Armstrong number :"+n);
	}

}
