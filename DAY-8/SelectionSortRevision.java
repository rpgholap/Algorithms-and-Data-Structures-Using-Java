

class SelectionSortRevision{
	public void sort(int arr[]){
		int n = arr.length;
		for(int i = 0; i< n - 1; i++){
		int min = i;
			for(int j = i+1 ; j < n-1 ;j++){
			
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		
		}
		
	}
	
	public void display(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i<n ; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String args[]){
		SelectionSortRevision b = new SelectionSortRevision();
		int arr[] = {10, 1, 22, 2, 5, 90};
		
		b.sort(arr);
		b.display(arr);
		
		
	}

}

// 1 2 5 10 22 90