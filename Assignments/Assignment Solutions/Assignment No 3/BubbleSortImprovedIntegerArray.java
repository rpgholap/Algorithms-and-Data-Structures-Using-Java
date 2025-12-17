/*
Q1. Bubble Sort
Write a program to implement Bubble Sort on an integer array.
Test Cases:
• Input: [5, 2, 9, 1, 5, 6] → Output: [1, 2, 5, 5, 6, 9]
• Input: [3, 2, 1] → Output: [1, 2, 3]
• Input: [1, 2, 3] → Output: [1, 2, 3]
*/  

import java.util.*;
class BubbleSortImprovedIntegerArray{
	
	static void bubbleSort(int arr[]){
		boolean x;

		// run the steps n-1 times 
		for(int i = 0; i < arr.length -1; i++){     // runs passes
			x = false;                     // swap is not perform 
			
			// for each step max item will come at the last respective index
			for(int j = 0; j < arr.length - i - 1; j++){  
				if(arr[j] > arr[j+1]){   
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					x= true;    // when swapping done then return true
				}
			}
		}
	}
	
	void display(int arr[]){
		int n = arr.length;
		
		for(int i =0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		int arr[]= {5, 2, 9, 1, 5, 6};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
/*
[5, 2, 9, 1, 5, 6]
i = 0:
compare 5 and 2 --> swap  --> [2, 5, 9, 1, 5, 6]
compare 5 and 9 --> no swap 
compare 9 and 1 --> swap --> [2, 5, 1, 9, 5, 6]
compare 9 and 5 --> swap --> [2, 5, 1, 5, 9, 6]
compare 9 and 6 --> swap --> [2, 5, 1, 5, 6, 9]

i = 1:
compare 2 and 5 → no swap
compare 5 and 1 → swap → [2, 1, 5, 5, 6, 9]
compare 5 and 5 → no swap
compare 5 and 6 → no swap
*/

/*

output:
Before sorting:
5 2 9 1 5 6
Bubble sort:
1 2 5 5 6 9
*/