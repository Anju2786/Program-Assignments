package numbers;

public class Paliandrome {
	public static void main(String[]arg) {
		int num=121;
		int sum=0;
		int num1=num;
		
		while(num!=0)
		{
			sum=sum*10+num%10;
			num=num/10;
		}
		
		if(num1==sum)
			System.out.println("paliandrome");
		else
			System.out.println("not a paliandrome");

}
}