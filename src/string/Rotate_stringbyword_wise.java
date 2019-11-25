package string;

public class Rotate_stringbyword_wise {
	public static void main(String[]args) {
		String sentence="i love Bangalore";
		String[] str = sentence.split(" ");
		//String reversestring = "";
		for (int i=0;i<str.length;i++)
		{
			String word=str[i];
		String reverseword = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+ word.charAt(j);
				
			}
			word=reverseword;
			System.out.println("reverse string:"+word);
			//reversestring=reversestring+reverseword+" ";	
		}
		
	}


}
