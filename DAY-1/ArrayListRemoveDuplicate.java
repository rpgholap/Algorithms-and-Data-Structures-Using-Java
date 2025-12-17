// To remove duplicates from ArrayList;

import java.util.*;

public class ArrayListRemoveDuplicate{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,5));	
		// ArrayList<Integer> list1 = new ArrayList<>(Arrays.asLinkedList(1,2,3,4,5,5,6,5));
		// ArrayList<Integer> list2 = new ArrayList<>(Arrays.asArrayList(1,2,3,4,5,5,6,5));
		
		// To preserve order of insertion :we use "LinkedList" 
		ArrayList<Integer> unique = new ArrayList<>(new LinkedHashSet<>(list));   //--> by preserving insertion order with Hashset(gives unique only : duplicates not allowed)
		
		// Display:
		System.out.println("Display Original List: " + list);
		System.out.println("Display without duplicates: " + unique);

	}
}

/*
	Display Original List: [1, 2, 3, 4, 5, 5, 6, 5]
	Display without duplicates: [1, 2, 3, 4, 5, 6]

*/