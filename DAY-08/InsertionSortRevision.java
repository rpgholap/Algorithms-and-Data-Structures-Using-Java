// Insertion Sort

import java.util.*;
class InsertionSortRevision{
	
	static void insertionSort(int[] arr) {
		
        for(int i = 0; i < arr.length - 1 ; i++){
			for(int j = i+1; j > 0 ; j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else{
					break;
				}
			}
		}
    }

	public static void main(String args[]){
		InsertionSortRevision b1 = new InsertionSortRevision();
		int arr[] = {3,23,45,10,90, 22};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
}

//[3, 10, 22, 23, 45, 90]