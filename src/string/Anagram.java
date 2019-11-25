package string;

public class Anagram {
	public static void main(String[] args) {
		String s1="army";
		String s2="mary";
	char[] ch1 = s1.toCharArray();
	char[] ch2 = s2.toCharArray();	
	if(ch1.length==ch2.length)
	{
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;i<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					ch2[j]=' ';
					break;
				}
			}
		}
		int k=0;
		for( k=0;k<=ch2.length-1;k++)
		{
			if (ch2[k]!=' ')
				break;
			
		}
		if(k==ch2.length)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}
	}

}
