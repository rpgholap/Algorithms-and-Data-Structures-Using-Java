/*
Q5. Quick Sort
Implement Quick Sort using the last element as the pivot.
Test Cases:
• Input: [10, 7, 8, 9, 1, 5] → Output: [1, 5, 7, 8, 9, 10]
• Input: [1, 1, 1, 1] → Output: [1, 1, 1, 1]
*/
import java.util.*;
class QuickSortExample{
	public static void main(String args[]){
		int arr[] = {10, 7, 8, 9, 1, 5};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		// Internal Sorting Algorithm: O(N log N) --> use internally quick sort 
		// Arrays.sort(arr);
	}
	
	static void sort(int[] nums, int low, int high){
		if(low >= high){
			return;
		}
		
		int s = low;
		int e = high;
		// int m = s + (e - s)/2;
		// int pivot = nums[m];    --> pivot at middle 
		int pivot = nums[high];    // --> at last  
		
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

// [1, 5, 7, 8, 9, 10]