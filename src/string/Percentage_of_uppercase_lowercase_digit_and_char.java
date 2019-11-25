package string;

public class Percentage_of_uppercase_lowercase_digit_and_char {
	public static void main(String[] args) {
		 String str="Hello word How Are You**81";
		 char ch[] = str.toCharArray();
	        int uppercase=0;
	        int lowercase=0;
	        int digit=0;
	        int others=0;
	        int total=ch.length;
	        for(int i=0;i<=ch.length-1;i++)
	        {
	        	if(Character.isUpperCase(ch[i]))
	        		uppercase++;
	        	
	        	else if(Character.isLowerCase(ch[i]))
	        		lowercase++;
	        	
	        	else if(Character.isDigit(ch[i]))
	        		digit++;
	        	else 
	        		others++;
	        	System.out.println("Total no.of characters:"+total);
	        	System.out.println(" uppercase:"+uppercase);
	        	System.out.println("percentage of uppercase:"+(uppercase*100)/total);
	        	System.out.println(" lowercase:"+lowercase);
	        	System.out.println("percentage of lowercase:"+(lowercase*100)/total);
	        	System.out.println(" Digit:"+digit);
	        	System.out.println("percentage of digit:"+(digit*100)/total);
	        	System.out.println(" Other:"+others);
	        	System.out.println("percentage of others:"+(others*100)/total);
	        }

}
}