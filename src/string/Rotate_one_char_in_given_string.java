package string;

public class Rotate_one_char_in_given_string {
	public static void main(String []args) {
		
		//String str="Testyantra";
		String str="hello world how are you";
		String[] sa = str.split(" ");
		StringBuilder sb=new StringBuilder(sa[0]);
		sa[0]=sb.reverse().toString();
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
			
		}
		
		
	}

}
