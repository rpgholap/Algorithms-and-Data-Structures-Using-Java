/*
11. Write a Java program to add, update, remove, and display elements using
LinkedList.
Testcase:
Input: ADD A
ADD B
ADD C
REMOVE 0
DISPLAY
Output: [B, C]
Input: ADD A
ADD B
ADD C
UPDATE 1 X
DISPLAY
Output: [A, X, C]

*/


import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        // 1. CREATE a new LinkedList
        // This LinkedList is named 'fruits' and will store text (String).
        LinkedList<String> fruits = new LinkedList<>();
        System.out.println("An empty list has been created.");
        System.out.println("------------------------------------");

        // 2. ADD elements to the list
        // The .add() method appends elements to the end of the list.
        System.out.println("Step 1: ADDING elements...");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 3. DISPLAY the elements
        // Printing the list object directly shows its contents.
        System.out.println("The list now contains: " + fruits);
        System.out.println("------------------------------------");


        // 4. UPDATE an element
        // The .set(index, newElement) method changes an element at a specific position.
        // List indexes start from 0. So, index 1 is the second element ("Banana").
        System.out.println("Step 2: UPDATING an element...");
        System.out.println("Changing the element at index 1 from 'Banana' to 'Blueberry'.");
        fruits.set(1, "Blueberry");

        // Display the list again to see the change
        System.out.println("The list now contains: " + fruits);
        System.out.println("------------------------------------");


        // 5. REMOVE an element
        // The .remove(index) method deletes an element at a specific position.
        // Let's remove the first element at index 0 ("Apple").
        System.out.println("Step 3: REMOVING an element...");
        System.out.println("Removing the element at index 0 ('Apple').");
        fruits.remove(0);

        // Display the final list
        System.out.println("The final list contains: " + fruits);
        System.out.println("------------------------------------");
    }
}


/*
An empty list has been created.
------------------------------------
Step 1: ADDING elements...
The list now contains: [Apple, Banana, Cherry]
------------------------------------
Step 2: UPDATING an element...
Changing the element at index 1 from 'Banana' to 'Blueberry'.
The list now contains: [Apple, Blueberry, Cherry]
------------------------------------
Step 3: REMOVING an element...
Removing the element at index 0 ('Apple').
The final list contains: [Blueberry, Cherry]
------------------------------------
*/