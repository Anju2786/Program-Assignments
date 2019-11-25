package p_Array;

public class ReverseEvenIndex {
	public static void main(String []arg) 
	{
		int array[]= {20,50,30,10,80,90};
		 System.out.print("Reverse Even indexed elements :");
		 int temp;
		 int i,j;
	 for( i=0,j=array.length-2;i<=array.length/2;i=i+2,j=j-2)
		 {
		  
			  temp=array[i];
			  array[i]=array[j];
			  array[j]=temp;
			  
		   
			 
		 }
	 for( int k=0; k<=array.length-1;k++)
			 {
		         System.out.print(array[k]+" "); 
			 }
	}
	
	     }

	

