package string;

public class Words_in_string {
	public static void main(String []args)
	{
		String str="Basawankudi peanut festival";
		 String[] str1=str.split(" ");
		 int count=0;
		 for(int i=0;i<str1.length;i++)
			 count++;
		System.out.println("No. of words in the sentance:"+count);
	}

}
