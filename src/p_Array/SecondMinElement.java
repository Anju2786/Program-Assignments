package p_Array;

public class SecondMinElement {
	  public static void main(String args[]){
	      int temp, size;
	      int array[] = {2, 20,10, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("2nd Smallest element of the array is:: "+array[1]);
	      System.out.println("2nd Largest element of the array is:: "+array[array.length-2]);
	   }

}
