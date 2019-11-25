package string;

public class Duplicate_words {
	public static void main(String[]args) {
	 String str="Hello World Hello";
	 // String str="No heart is so hard as the timid heart";
	 String[] str1=str.split(" ");
	 
	 for(int i=0;i<str1.length;i++)
	 {
		int  count=1;
		 for(int j=i+1;j<str1.length;j++) {
			 if(str1[i].equals(str1[j]))
			 {
				str1[j]=" ";
			
				count++;
			 }
			 
		 }
		 if ( str1[i]!=" ") {
			 
			System.out.println(str1[i]+":"+count);
		
		
	 }
	
	}
	}
}


