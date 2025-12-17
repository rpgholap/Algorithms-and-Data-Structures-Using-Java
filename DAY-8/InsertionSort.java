// Insertion Sort

import java.util.*;
class InsertionSort{
	
	static void insertionSort(int[] arr) {
		
        for(int i = 0; i < arr.length - 1 ; i++){
			for(int j = i+1; j > 0 ; j--){
				if(arr[j] < arr[j-1]){
					swap(arr, j, j-1);
				}
				else{
					break;
				}
			}
		}
        // return arr;
    }
	
	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void main(String args[]){
		InsertionSort b1 = new InsertionSort();
		int arr[] = {3,23,45,10,90, 22};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
}

//[3, 10, 22, 23, 45, 90]