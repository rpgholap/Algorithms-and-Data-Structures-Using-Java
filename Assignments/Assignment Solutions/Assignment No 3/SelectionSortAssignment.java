/*
Q3. Selection Sort
Sort an array using Selection Sort.
Test Cases:
• Input: [64, 25, 12, 22, 11] → Output: [11, 12, 22, 25, 64]
• Input: [29, 10, 14, 37, 13] → Output: [10, 13, 14, 29, 37]
*/

class SelectionSortAssignment{

	void selectionSort(int arr[]){
		
		for(int i = 0; i < arr.length-1; i++){
			
			int min = i;    // first element in array = min
			for(int j = i + 1; j < arr.length; j++){
				// identify smallest element
				if(arr[j] < arr[min]){
					min = j;  
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
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
		SelectionSortAssignment b1 = new SelectionSortAssignment();
		int arr[] = {64, 25, 12, 22, 11};
		System.out.println("Before Selection Sort: " );
		b1.display(arr);
		b1.selectionSort(arr);
		System.out.println("Selection Sort: " );
		b1.display(arr);
		
	}
	
}

/*
Before Selection Sort:
64 25 12 22 11
Selection Sort:
11 22 12 25 64
*/