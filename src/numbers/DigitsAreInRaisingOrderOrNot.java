package numbers;

public class DigitsAreInRaisingOrderOrNot {
	public static void main(String []arg) 
	{

	
	Integer num = 234;
    String string = num.toString(); 
    for(int x = 0; x < string.length() - 1; x++){
       
    	  if(string.charAt(x) <= '9' && string.charAt(x) >= '0' && string.charAt(x+1) <= '9' && string.charAt(x+1) >= '0'){
            if(Integer.valueOf(string.charAt(x)) < Integer.valueOf(string.charAt(x+1))){
                System.out.println("OK");
            }else{
                System.out.println("NOK");
            }
                
		   System.out.println(" Digits are in raising order");
		   



    }
	}
}
}


