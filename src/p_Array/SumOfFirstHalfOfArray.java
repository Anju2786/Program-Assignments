package p_Array;

public class SumOfFirstHalfOfArray {
	public static void main(String []arg) 
	{
		int array[]= {10,20,30,50,80,90};
		int sum=0;
	for(int i=0;i<=(array.length-1)/2;i++)
	   {
		
			sum=sum+array[i];
	    }
	 System.out.println("sum of 1st half array: "+sum);

}
}