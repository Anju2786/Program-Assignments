package string;

public class Palliandrome {
	 public static void main(String[] args) {
	String str="malayalam";
	char[] ch = str.toCharArray();
	int i,j;
	for( i=0,j=ch.length-1;i<=ch.length/2;i++,j--)
	{
		
			if(ch[i]!=ch[j])
			{
				break;
			}
	}
		
		if (i==(ch.length/2+1))
		{
			System.out.println(str+" is palliandrome");
		}
	}
	 
/*
String original = "malayalam"; 
String reverse="";
int length = original.length();   
for ( int i = length - 1; i >= 0; i-- )  
    reverse = reverse + original.charAt(i);  
if (original.equals(reverse))  
   System.out.println("Entered string is a palindrome.");  
else  
   System.out.println("Entered string isn't a palindrome."); 
  */
	}
	