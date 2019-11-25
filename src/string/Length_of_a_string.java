package string;

public class Length_of_a_string {
	public static void main(String[]args) {
		String  str="Bangalore is a beautiful city";
		char [] ch=str.toCharArray();
		int length =0;
		for(char c:ch)
			length++;
		System.out.println("legth of the string:"+length);
		
	}

}
