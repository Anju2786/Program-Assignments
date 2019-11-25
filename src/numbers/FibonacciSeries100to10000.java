package numbers;

public class FibonacciSeries100to10000 {
	public static void main(String []arg) {
		int a=100;
		int b=101;
		int i=100;
		System.out.print(a+" "+b+" ");
		int c;
		do {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		while(i<1000);
			

}
}