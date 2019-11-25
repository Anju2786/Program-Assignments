package p_Array;

public class SumOfAllElementsInSecondhalf {
	public static void main(String []arg) 
	{
		int array[]= {10,20,30,50,80,90};
		int sum=0;
	for(int i=(array.length)/2;i<=array.length-1;i++)
	   {
		
			sum=sum+array[i];
	    }
	 System.out.println("sum of 2nd half array: "+sum);

}

}
