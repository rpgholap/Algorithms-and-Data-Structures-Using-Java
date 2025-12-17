// Quick Sort: work on statergy Divide and Conquer

class QuickSort{
	public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    static void sort(int[] nums, int low, int high){
		if(low >= high){
			return;
		}
		
		int s = low;
		int e = high;
		int m = s + (e - s)/2;
		
		int pivot = nums[m];
		
		while(s <= e){
			
			// also a reason why if its already sorted it will not swap
			while(nums[s] < pivot){
				s++;
			}
			while(nums[e] > pivot){
				e--;
			}
			if( s <= e ){
				int temp = nums[s];
				nums[s] = nums[e];
				nums[e] = temp;
				s++;
				e--;
			}
		}
		// recursion call
		// now my pivot is at correct index, sort two halves
		sort(nums, low, e);
		sort(nums, s, high);
	}
	
}
