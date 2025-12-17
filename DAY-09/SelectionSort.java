/*
// Finds the smallest element and places it at the  

In any situation like sorted unsorted Selection sort gives same time complexity which is O(n^2).

Time complexity:
Best = Worst = Avg = O(n^2)
*/
class SelectionSort{
	
	void selectionSort(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++){
			
			int min = i;    // first element in array = min
			for(int j = i + 1; j < n; j++){
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
		SelectionSort b1 = new SelectionSort();
		int arr[] = {3,23,45,10,90, 22};
		
		b1.display(arr);
		b1.selectionSort(arr);
		System.out.println("Selection Sort: " );
		b1.display(arr);
		
	}
}

/*
output:
3 23 45 10 90 22
Selection Sort:
3 10 22 23 45 90
*/