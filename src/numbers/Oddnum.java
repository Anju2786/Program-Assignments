package numbers;

public class Oddnum {
	public static void main (String[] args) {
		int a[]= {2,3,9,8,47,48};
		System.out.print("  odd num ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==1)
				System.out.print(a[i]+" ");
		}
	}

}
