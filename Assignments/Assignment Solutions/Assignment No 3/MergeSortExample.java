/*
Q4. Merge Sort
Write a recursive program to implement Merge Sort.
Test Cases:
• Input: [38, 27, 43, 3, 9, 82, 10] → Output: [3, 9, 10, 27, 38, 43, 82]
• Input: [5, 4, 3, 2, 1] → Output: [1, 2, 3, 4, 5]
*/

import java.util.*;
class MergeSortExample{
	public static void main(String args[]){
		int arr[] = {38, 27, 43, 3, 9, 82, 10};
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] mergeSort(int[] arr){
		if(arr.length == 1){
			return arr;
		}
		
		int mid = arr.length /2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}
		private static int[] merge(int[] first, int[] second){
			int[] mix = new int[first.length + second.length];
			
			int i = 0;   // pointing to arr1
			int j = 0;   // pointing to arr2
			int k = 0;   // pointer for new array
			
			while(i  < first.length && j < second.length){
				if(first[i] < second[j]){
					mix[k] = first[i];
					i++;
				}
				else{
					mix[k] = second[j];
					j++;
				}
				k++;   // every time after adding element move ahead.
			} 
			
			// it may be possible that one of the arrays is not complete : copy the remaining elements
			while( i < first.length){
				mix[k] = first[i];
				i++;
				k++;
			}
			while( j < second.length){
				mix[k] = second[j];
				j++;
				k++;
			}
			
			return mix;
			
		}
}

// [3, 9, 10, 27, 38, 43, 82]