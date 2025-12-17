/*
Q6. Sorting Strings (Lexicographic Order)
Write a program to sort an array of strings using any sorting algorithm.
Test Cases:
• Input: ["apple", "banana", "cherry", "date"] → Output: ["apple", "banana",
"cherry", "date"]
• Input: ["dog", "cat", "elephant", "bee"] → Output: ["bee", "cat", "dog",
"elephant"]
*/


// using merge sort :


import java.util.Arrays;

class StringSortwithMergeSort {
    public static void main(String args[]) {
        String arr[] = {"apple", "banana", "cherry", "date"};
		arr.mergeSort(arr, 0 , arr.length-1);
        System.out.println("Sorted Strings: " + Arrays.toString(arr));
    }
	
	
	static void mergeSort(String arr[], int l, int r){
		if(l < r){
			int mid = (l + (r - l)/2);
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r );
			
			merge(arr, l, mid, r);
		}
	}
	
	static void merge(String arr[], int l , int mid, int r){
		
		int n1 = mid - l + 1;    // left side elements
		int n2 = r - mid;        // right side elements
		
		String L[] = new String[n1];
		String R[] = new String[n2];
		
		// Transfer all elements to L and R 
		for(String i = 0; i < n1; i++){
			L[i] = arr[l + i];
		}
		for(String j = 0; j < n2; j++){
			R[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0;
		int k = l;
		
		while(i < n1 && j < n2){
			if(L[i].compareTo(R[j]) <= 0){
				arr[k] = L[i];
				i++;
			} else{
				arr[k] = R[j];
				j++;
			}
			k++;
			
		}
		// Handles remaining elements
			while(i < n1){
				arr[k] = L[i];
				i++;
				k++;
			}
			while(j < n2){
				arr[k] = R[j];
				j++;
				k++;
			}
	}
}
