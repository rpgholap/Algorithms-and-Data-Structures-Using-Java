// insert element into their correct position 
// best case: O(n)  --> only upper for loop will be excecuted.
// avg and worst case: O(n^2)   --> for and while loops


class InsertionSort{
	
	void insertionSort(int arr[]){
		int n = arr.length;
		
		for(int i = 1; i < n; i++){
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key){
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
		InsertionSort b1 = new InsertionSort();
		int arr[] = {3,23,45,10,90, 22};
		
		b1.display(arr);
		b1.insertionSort(arr);
		System.out.println("Insertion Sort: " );
		b1.display(arr);
		
	}
}

/*
3 23 45 10 90 22
Insertion Sort:
3 10 22 23 45 90
*/