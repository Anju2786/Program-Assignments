package p_Array;

public class MinValueof1sthalf {
	public static void main(String []arg) 
	{
		int array[]= {10,50,30,20,80,90};
		int temp;
	for(int i=0;i<=(array.length-1)/2;i++)
	   {
		for(int j=0;j<=(array.length-1)/2;j++)
		{
		if(array[i]<array[j])
		   {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		   }		
	    }
	
	   }

	 System.out.println("Min value of 1st half array: "+array[0]);
	 System.out.println("Min value of 1st half array: "+array[(array.length-1)/2]);
}
}
