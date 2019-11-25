package p_Array;

public class Reverse1stHalfElements {
	public static void main(String []arg) 
	{
		int array[]= {20,50,30,10,80,90};
	
		System.out.print("1st half Reverse order:");
	for(int i=(array.length-1)/2;i>=0;i--)
	   {
		System.out.print(array[i]+" ");
	   }
	System.out.println();
	System.out.print("2nd half Reverse order:");
	for(int i=(array.length-1);i>(array.length-1)/2;i--)
	   {
		System.out.print(array[i]+" ");
}

	}
}


