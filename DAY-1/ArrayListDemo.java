// ArrayList Program :  CURD (Add, Update, Remove, Display)

import java.util.*;

public class ArrayListDemo{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<>();   // list  -> reference, Arraylist  -> class 
		
		// Add : add()
		list.add("Apple");
		list.add("Banana");
		list.add("Chickoo");
		list.add("PineApple");
		list.add("Grapes");
		System.out.println("ADD List: " + list);
		
		//Update: set()  --> works on index
		list.set(1, "Cherry");        //set(index, updateName);
		System.out.println("Updated List: " + list);
		
		
		// Remove by index: remove(index)
		list.remove(0);
		System.out.println("Remove by index : " + list);
		
		// Remove by value: remove(value)
		list.remove("Cherry");
		System.out.println("Remove by value: " + list);
		
		
		// Display:
		System.out.println("Display List: " + list);

	}
}

/*
	ADD List: [Apple, Banana, Chickoo, PineApple, Grapes]
	Updated List: [Apple, Cherry, Chickoo, PineApple, Grapes]
	Remove by index : [Cherry, Chickoo, PineApple, Grapes]
	Remove by value: [Chickoo, PineApple, Grapes]
	Display List: [Chickoo, PineApple, Grapes]
*/