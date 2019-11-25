package p_Array;

public class MinValuein2ndHalf {
	public static void main(String []arg) 
	{
		int array[]= {20,50,30,100,80,90};
		int temp;
	for(int i=(array.length)/2;i<(array.length);i++)
	   {
		for(int j=(array.length)/2;j<(array.length);j++)
		{
		if(array[i]<array[j])
		   {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		   }		
	    }
	
	   }

	 System.out.println("Min value of 2nd half array: "+array[(array.length)/2]);
	 System.out.println("Max value of 2nd half array: "+array[(array.length-1)]);
}

}
