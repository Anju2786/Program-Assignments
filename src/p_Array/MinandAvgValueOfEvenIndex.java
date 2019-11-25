package p_Array;

public class MinandAvgValueOfEvenIndex {
	public static void main(String []arg) {
		int array[]= {20,10,5,80,70,90,46,32};
		int temp;
		
		for(int i=0;i<array.length;i=i+2)
		{
			for(int j=0;j<array.length;j=j+2)
			 {
				if(array[i]<array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			    }
			  }
		
		}
			
	
		System.out.println("minimum value:"+array[0]);
		
		int evensum=0;
		int count=0;
		int arr[]= {10,20,30,40,50,60,80};
		for(int i=0;i<arr.length;i=i+2)
		{
			count++;
			evensum=evensum+arr[i];
			
		}
		
		System.out.println("Avg value:"+evensum/count);
		
}
}

