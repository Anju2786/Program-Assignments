package p_Array;

public class EvenIndexElementFromReverse {
	public static void main(String []arg) 
	{
		int array[]= {20,50,30,10,80,90};
		 System.out.print("Even indexed elements from reverse:");
	 for(int i=array.length-1;i>=0;i--)
	 {
		 if(i%2==0)
		 {
			 System.out.print(array[i]+" ");
		 }
	 }

}

}
