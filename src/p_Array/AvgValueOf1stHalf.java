package p_Array;

public class AvgValueOf1stHalf {
	public static void main(String []arg) 
	{
		int array[]= {10,50,30,20,80,90};
		int sum=0;
		int count=0;
	for(int i=0;i<=(array.length-1)/2;i++)
	{
		count++;
		sum=sum+array[i];
	}
	System.out.println("Avg value:"+sum/count);
	}
		

}
