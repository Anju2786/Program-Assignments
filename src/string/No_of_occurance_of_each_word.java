package string;

import java.util.Scanner;

public class No_of_occurance_of_each_word {
	public static void main(String[]arg) {
		
		String word = "malayalam";
		char[]ch=word.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			 count=1;
		   if(ch[i]!=' ')
			   for(int j=i+1;j<=ch.length-1;j++)
			   {
				  
				   if(ch[i]==ch[j])
				   {
				   ch[j]=' ';
				   count ++;
				   }
			   }
		   if (ch[i]!=' ') {
			   System.out.println("no of time "+ch[i]+" occured="+count);
		}
		   
		}
		
	}


}
