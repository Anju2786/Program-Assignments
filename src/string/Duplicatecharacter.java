package string;

import java.util.Scanner;

public class Duplicatecharacter {
	public static void main(String[]arg) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		String word = s1.nextLine();
		s1.close();
		char[] ch = word.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			   if(ch[i]!=' ')
			   for(int j=i+1;j<=ch.length-1;j++)
			   {
				  
				   if(ch[i]==ch[j])
				   {
				   System.out.println("Duplicate chatacter:"+ch[i]);
				   }
			   }
		}
	}
}
