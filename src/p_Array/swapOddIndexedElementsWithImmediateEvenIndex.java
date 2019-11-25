package p_Array;

public class swapOddIndexedElementsWithImmediateEvenIndex {
	public static void main(String []arg) 
	{
		int a[]= {20,50,30,10,80,90};

	int i,j;
		for( i=1;i<=a.length-2;i=i+2)
		{
		if(i%2==1)
			{
			
		j=i+1;
			int temp;
			temp=a[i];
	          a[i]=a[j];
		     a[j]=temp;
			
			}
		}

			for(int k=0;k<a.length;k=k+1)
			{
					System.out.print(a[k]+" ");
			}
	     }
			
	 
		
	}
	


