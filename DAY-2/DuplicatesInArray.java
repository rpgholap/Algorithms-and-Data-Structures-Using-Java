// find a duplicate in an array using recursion.

class DuplicatesInArray{
	static int findDuplicates(int[] arr, int index, int checkIndex){
		 // if we reached the last element → no duplicate found
		if( index >= arr.length -1){
			return -1;
		}
		
		 // compare arr[index] with next elements
		if(checkIndex < arr.length){
			if(arr[index] == arr[checkIndex]){
				return arr[index];   // duplicate found
			}
			
			// check next element
			return findDuplicates(arr, index, checkIndex + 1);
		}
		
		
		// move to the next index
		return findDuplicates(arr, index+1, index+2);
		
		
	}
	
	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 2, 5};
        int[] arr2 = {6, 7, 8, 9};

        System.out.println(findDuplicates(arr1, 0, 1)); // Output: 2
        System.out.println(findDuplicates(arr2, 0, 1)); // Output: -1
    }
	
}

// 2
// -1