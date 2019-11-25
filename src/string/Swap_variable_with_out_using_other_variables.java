package string;

public class Swap_variable_with_out_using_other_variables {
	  public static void main(String args[]) {  
	        String a = "Bangalore";  
	        String b = "City";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After : " + a + " " + b);  

}
}