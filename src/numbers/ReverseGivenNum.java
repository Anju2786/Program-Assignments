package numbers;

public class ReverseGivenNum {
	public static void main(String[]arg) {
		int num=4586;
		int reverse=0;
		 do {
			reverse= reverse*10+num%10;
		
			num=num/10;
		}
		 while (num>0);
		
   System.out.println("Reverse num " +reverse );
}
}
