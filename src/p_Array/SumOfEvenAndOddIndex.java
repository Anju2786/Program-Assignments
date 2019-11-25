package p_Array;

public class SumOfEvenAndOddIndex {
	public static void main(String []arg) 
	{
		int array[]= {10,20,30,50,80,90};
		int evensum=0,oddsum=0;
	for(int i=0;i<array.length;i++)
	{
		if(i%2==0)
			evensum=evensum+array[i];
		if(i%2!=0)
			oddsum=oddsum+array[i];
	}
		System.out.println("even sum:"+evensum);
		System.out.println("odd sum:"+oddsum);
		
	}

}

