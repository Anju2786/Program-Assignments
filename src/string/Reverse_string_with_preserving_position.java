package string;

public class Reverse_string_with_preserving_position {
	 public static void main(String[] args) {
		 String str="Hello word ";
		 int len = str.length();
	        char arr[] = str.toCharArray();
	        for(int i=0, j = len-1; i<=j; i++,j--){
	            if(arr[i] == ' ')
	            	i++;
	            if(arr[j] == ' ')
	            	j--;

	            char tmp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = tmp;

	        }
	        System.out.println(arr);
		 
	 }

}
