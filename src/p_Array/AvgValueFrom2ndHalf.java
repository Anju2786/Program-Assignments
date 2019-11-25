package p_Array;

public class AvgValueFrom2ndHalf {
	public static void main(String []arg) 
	{
		int array[]= {20,50,30,10,80,90};
		int sum=0;
		int count=0;
	for(int i=(array.length)/2;i<(array.length);i++)
	   {
		count++;
		sum=sum+array[i];
	   }
   System.out.println("Avg value of element from 2nd half:"+sum/count);
}
}
