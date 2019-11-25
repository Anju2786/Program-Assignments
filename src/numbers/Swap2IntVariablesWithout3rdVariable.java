package numbers;

public class Swap2IntVariablesWithout3rdVariable {
	public static void main(String[]arg) {
		int x=20;
		int y=30;
		System.out.println(" Before swaping :"+x +","+y);
	
		x=x+y;
		y=x-y;
		x=x-y;
	System.out.println(" After swaping :" + x + ","+y);
	}

}
