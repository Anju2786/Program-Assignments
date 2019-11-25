package p_Array;

public class Sumofallelements {
	public static void main(String []arg) 
	{
		int array[]= {10,20,30,50,80,90};
		int sum=0;
		for(int num: array)
			sum=sum+num;
		System.out.println("sum:"+sum);
	}

}
