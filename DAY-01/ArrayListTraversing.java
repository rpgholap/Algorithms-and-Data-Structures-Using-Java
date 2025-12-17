// Traversing an ArrayList using various methods

import java.util.*;

public class ArrayListTraversing{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Junnar" , "Otur", "Pune", "Mumbai"));	

		System.out.println("Display Original List: " + list);
		
		//Method 1: standard method  -> for loop
		for(int i=0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");           //prints indexwise
		} 
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		// Method 2: for-each 
		for(String s: list){
			System.out.print(s + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		//Method 3: Iterator : prints in forward direction 
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		
		//Method 4: ListIterator : prints in forward direction 
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()){
			System.out.print(lit.next() + " ");
		}
		System.out.println();
		
		//Method 5: ListIterator : prints in backward direction
		while(lit.hasPrevious()){
			System.out.print(lit.previous() + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		//Method 6: for-each() using lamda function
		list.forEach(x  -> System.out.print(x + "  "));

	}
}

/*
Display Original List: [Junnar, Otur, Pune, Mumbai]
Junnar Otur Pune Mumbai
----------------------------------------------------------
Junnar Otur Pune Mumbai
----------------------------------------------------------
Junnar Otur Pune Mumbai
----------------------------------------------------------
Junnar Otur Pune Mumbai
Mumbai Pune Otur Junnar
----------------------------------------------------------
Junnar  Otur  Pune  Mumbai
*/