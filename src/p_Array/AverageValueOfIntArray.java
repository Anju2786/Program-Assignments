package p_Array;

public class AverageValueOfIntArray {
	public static void main(String []arg) 
	{
		int array[]= {10,20,30,50,80,90};
		int sum=0;
		for(int num: array)
			sum=sum+num;
		
		double avg=sum/(array.length);
		System.out.println("sum:"+sum);
		System.out.println("Average:"+avg);
	}


}
