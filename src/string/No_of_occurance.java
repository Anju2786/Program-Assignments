package string;

import java.util.Scanner;

public class No_of_occurance {
	public static void main(String[]arg) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		String word = s1.nextLine();
		System.out.println("enter the character");
		char c = s1.next().charAt(0);
		char[] ch = word.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		   
		   if(ch[i]==c)
			   count++;
		}
		System.out.println("no of time "+c+" occured="+count);
	}

}
