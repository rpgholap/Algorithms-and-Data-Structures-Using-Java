/*
9. Display duplicate elements from an array.
Testcase1:
Input: [1, 2, 3, 4, 2, 5, 1]
Expected Output: 1, 2
Testcase2:
Input: [10, 20, 30, 40, 50]
Expected Output: No duplicates found
*/

class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,1};
        boolean found = false;
        for (int i=0; i<arr.length; i++) {         // check one element
            for (int j=i+1; j<arr.length; j++) {   // compare with other elements
                if (arr[i]==arr[j]) {                //checks duplicates
                    System.out.println(arr[i]);
                    found = true;
                }
            }
        }
        if (!found) 
			System.out.println("No duplicates found");
    }
}


/*
i = 0 --> arr[0] = 1
	compare : arr[0] = 1 with arr[1] = 2 (likewise it checks for rest of the elements)
			  .
			  .
			  .arr[0] = 1 with arr[6= = 1 --> print 1
i = 1 --> arr[1] = 2 
	compare : arr[1] = 2 with arr[2] = 3 
			  ..
			  arr[1] = 2 with arr[4] = 2 --> print 2
			  arr[1] = 2 with arr[5] = 5
*/


/*
output:
1
2
*/