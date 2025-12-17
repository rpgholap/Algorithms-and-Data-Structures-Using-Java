class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 60;

        int result = binarySearch(arr, key);
		System.out.println("Element found at index: " +result);
    }

    public static int binarySearch(int arr[], int target){
	
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end){
			int mid = start + (end - start)/2;
			
			if(target < arr[mid]){
				end = mid - 1;
			} else if(target > arr[mid]){	
				start = mid + 1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}


//Element found at index: 5