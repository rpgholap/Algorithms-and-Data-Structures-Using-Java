/*
Q2. Insertion Sort
Implement Insertion Sort to arrange elements in ascending order.
Test Cases:
• Input: [12, 11, 13, 5, 6] → Output: [5, 6, 11, 12, 13]
• Input: [4, 3, 2, 10, 12] → Output: [2, 3, 4, 10, 12]
*/

class InsertionSortAsc{
	void insertionSort(int arr[]){
		int n = arr.length;
		
		for(int i = 1; i < n; i++){
			int key = arr[i];       // element to be inserted
			int j = i - 1;          // compares with prev element
			
			while(j >= 0 && arr[j] > key){         // shift the elements which are greater than key
				arr[j+1] = arr[j];
				j = j - 1;
			}
			
			arr[j+1] = key;
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
		InsertionSortAsc b1 = new InsertionSortAsc();
		int arr[] = {12, 11, 13, 5, 6};
		System.out.println("Before Insertion Sort: " );
		b1.display(arr);
		b1.insertionSort(arr);
		System.out.println("Insertion Sort: " );
		b1.display(arr);
		
	}
}

/*
 i=1, key=11, j=0 → shift 12 → insert at j+1=0 → [11, 12, 13, 5, 6]
 i=2, key=13, j=1 → no shift → insert at j+1=2 → [11, 12, 13, 5, 6]
 i=3, key=5, j=2 → shift 13, j=1 → shift 12, j=0 → shift 11, j=-1 → insert at j+1=0 → [5, 11, 12, 13, 6]
 i=4, key=6, j=3 → shift 13, j=2 → shift 12, j=1 → shift 11, j=0 → stop, insert at j+1=1 → [5, 6, 11, 12, 13]
*/

/*
Before Insertion Sort:
12 11 13 5 6
Insertion Sort:
5 6 11 12 13
*/