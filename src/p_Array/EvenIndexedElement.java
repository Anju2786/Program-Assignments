package p_Array;

public class EvenIndexedElement {
	public static void main(String []arg) 
	{
		int array[]= {20,50,30,10,80,90};
		 System.out.print("Even indexed elements:");
	 for(int i=0;i<array.length;i++)
	 {
		 if(i%2==0)
		 {
			 System.out.print(array[i]+" ");
		 }
	 }

}
}
