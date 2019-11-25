package numbers;

public class Factorial {
	public static void main(String []arg) {
		int num=5;
		int prod=1;
		while(num>0)
		{
			prod=prod*num;
			num--;
			
		}
      System.out.println("Factorial :"+prod);
}
}