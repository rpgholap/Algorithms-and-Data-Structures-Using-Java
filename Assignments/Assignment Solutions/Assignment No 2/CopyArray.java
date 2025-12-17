
/*
8. Copy elements of one array into another.
Testcase:
Input: Source Array: [1, 2, 3, 4, 5]
Expected Output: Destination Array: [1, 2, 3, 4, 5]
*/

import java.util.Arrays;
class CopyArray {
    public static void main(String[] args) {
		/*
        int[] src = {1,2,3,4,5};
        int[] dest = new int[src.length];
        for (int i=0; i<src.length; i++) 
			dest[i] = src[i];
        System.out.println(Arrays.toString(dest));
		*/
		
		int[] src = {1,2,3,4,5};
		int[] dest = src.clone();               //Creates a shallow copy of the array.
		System.out.println(Arrays.toString(dest));

    }
}
