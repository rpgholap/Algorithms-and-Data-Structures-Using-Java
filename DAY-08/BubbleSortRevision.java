

class BubbleSortRevision{
	public void sort(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i< n - 1; i++){
			for(int j = 0; j < n-i-1 ;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		
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
		BubbleSortRevision b = new BubbleSortRevision();
		int arr[] = {10, 1, 22, 2, 5, 90};
		
		b.sort(arr);
		b.display(arr);
		
		
	}

}

// 1 2 5 10 22 90