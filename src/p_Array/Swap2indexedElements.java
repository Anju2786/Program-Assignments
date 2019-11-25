package p_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap2indexedElements {
	public static void main(String[]arg) {
		ArrayList<String> Al = new ArrayList<>(Arrays.asList("a","e","i","o","u"));
		System.out.println(Al);
		Collections.swap(Al,2,4);
		System.out.println(Al);
		
		
	}

}
