// Reverse an ArrayList

import java.util.*;

public class ArrayListReverse{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Junnar" , "Otur", "Pune", "Mumbai"));	

		System.out.println("Display Original List: " + list);
		
		// To reverse: it is not method of list  --> it is the method of parent class Collections
		Collections.reverse(list);

		System.out.println("Display Original List: " + list);

	}
}

/*
	Display Original List: [Junnar, Otur, Pune, Mumbai]
	Display Original List: [Mumbai, Pune, Otur, Junnar]

*/