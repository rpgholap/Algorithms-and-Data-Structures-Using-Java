// search an element from an array

class SearchInArray{
	public static void main(String args[]){
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int target = 110;
		int result = FindElement(arr, 0, target);
		System.out.println(result);
	}
	
	
	// Recursive Approch:
	public static int FindElement(int[] arr,int index, int target){
		if(index >= arr.length)
			return -1;
		if(arr[index] ==  target)
			return index;
		
		return FindElement(arr, index+1, target);
	}
	
	 
	/*
	// Iterative Approch: 
	public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
	
	*/
	
}

// 6