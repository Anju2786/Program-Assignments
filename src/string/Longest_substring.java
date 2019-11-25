package string;

public class Longest_substring {
	public static void main(String[] args) {
		 String str="Bangalore";
		 char[]ch=str.toCharArray();
		
		 String word=" ";
		 int i,j;
		 for( i=0, j=i+1;i<=ch.length-1;i++,j++)
		 {
					
				 word=word+ch[j];
			 
			 if(ch[i]==ch[j])
			 {
				 break;
			 }
			
			 System.out.print(word); 
		 }
		 

		 }
    }




