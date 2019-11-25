package string;

public class Reverse_first_half_seperatly_2ndseperatly {
	public static void main(String[]arg) {
		String sentence="welcome to Bangalore ";
		System.out.println(sentence);
		
      char[] ch=sentence.toCharArray();
	 for(int i=(ch.length-2)/2;i>=0;i--)
	 {
		 System.out.print(ch[i]);
	 }
	 System.out.println();
	for(int j=ch.length-1;j>(ch.length-2)/2;j--)
      {
	    System.out.print(ch[j]);
      }
	}

}
