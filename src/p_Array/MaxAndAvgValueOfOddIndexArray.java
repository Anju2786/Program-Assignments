package p_Array;

public class MaxAndAvgValueOfOddIndexArray {
	public static void main(String []arg) {
		int array[]= {20,10,5,80,70,90,46,32};
		int temp;
		
		for(int i=1;i<array.length;i=i+2)
		{
			for(int j=1;j<array.length;j=j+2)
			 {
				if(array[i]<array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			    }
			  }
		
		}
			
	
		System.out.println("Maximun odd index value:"+array[array.length-1]);
		
		int oddsum=0;
		int count=0;
		int arr[]= {10,20,30,40,50,60,80};
		for(int i=1;i<arr.length;i=i+2)
		{
			count++;
			oddsum=oddsum+arr[i];
			
		}
		
		System.out.println("Avg value:"+oddsum/count);
		
}

}
