package string;

public class Remove_white_space {
	 public static void main(String[] args) 
	    { 
	        String str = "      bangalore    basawankudi  kudulu        "; 
	       
	        str = str.replaceAll("\\s", ""); 
	       
	        System.out.println(str); 
	    } 

}
