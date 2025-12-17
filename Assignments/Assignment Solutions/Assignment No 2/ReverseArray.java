/*
5. Print array elements in reverse order.
Testcase1:
Input: [1, 2, 3, 4, 5]
Expected Output: [5, 4, 3, 2, 1]
Testcase2:
Input: [-1, 2, -3, 4, -5]
Expected Output: [-5, 4, -3, 2, -1]
*/

import java.util.*;

public class ReverseArray{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));	

		System.out.println("Display Original List: " + list);
		
		// To reverse: it is not method of list  --> it is the method of parent class Collections
		Collections.reverse(list);

		System.out.println("Display Original List: " + list);

	}
}


/*
import java.util.Arrays;
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
		// loop starts from last index till i = 0: 
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/


// Output:
// 5 4 3 2 1