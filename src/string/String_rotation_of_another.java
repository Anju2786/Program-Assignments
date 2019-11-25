package string;

import java.util.Arrays;
import java.util.Scanner;

public class String_rotation_of_another {
	public static void main(String[]arg) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the string");
	String input1 = s1.nextLine();
	System.out.println("enter the next string");
	String input2 = s1.nextLine();
	char[]ch1=input1.toCharArray();
	char[]ch2=input2.toCharArray();
//	if(ch1.length==ch2.length)
//	{
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if( Arrays.equals(ch1,ch2))
		System.out.println("rotation each other");
	else
		System.out.println("not rotation each other");
//	}
//	else 
//		System.out.println("not rotation each other");
}
}
