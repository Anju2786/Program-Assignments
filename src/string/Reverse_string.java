package string;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.ListIterator;

public class Reverse_string {
	public static void main(String[]arg)
	{
		//1. using StringBuffer
		 
		String str="Welcome to Ty";
		/*StringBuffer str1=new StringBuffer();
		str1.append(str);
		str1=str1.reverse();
		System.out.println(str1); */
		
		//2. using array
		/*char[]ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}*/
		
		// swap
		/* char[]word=str.toCharArray();
		 int left, right=0;
		 right=word.length-1;
		 for(left=0 ;left <right;left++,right--)
		 {
			 char temp=word[left];
			 word[left]=word[right];
			 word[right]=temp;
		 }
		 for (char swap : word) {
			 System.out.print(swap);
			
		}
		 */
		 
		// arraylist
		/* 
		 char[] ch1=str.toCharArray();
          List<Character> Al = new ArrayList<>();
          
		 for (char c : ch1) {
			 Al.add(c);
			 
			 Collections.reverse(Al);
			 ListIterator i1=Al.listIterator();
			 while(i1.hasNext())
				System.out.print(i1.next()); 
			 */
			
			String input = "Welcome to Bangalore"; 
		        char[] hello = input.toCharArray(); 
		        List<Character> trial1 = new ArrayList<>(); 
		  
		        for (char c: hello) 
		            trial1.add(c); 
		  
		        Collections.reverse(trial1); 
		        ListIterator li = trial1.listIterator(); 
		        while (li.hasNext()) 
		            System.out.print(li.next()); 
		}
	}




