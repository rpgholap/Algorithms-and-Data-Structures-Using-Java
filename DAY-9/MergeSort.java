// Merge Sort: work on statergy Divide and Conquer

class MergeSort{
	
	static void mergeSort(int arr[], int l, int r){
		if(l < r){
			int mid = (l + (r-l)/2);
			mergeSort(arr, l, mid);    // left part array
			mergeSort(arr, mid+1, r);  // right part array
			
			merge(arr, l, mid, r);    // merging of left and right array
		}
	}
	
	
	static void merge(int arr[], int l, int mid, int r){
		int n1 = mid - l + 1;
		int n2 = r -  mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		
		for(int j = 0; j < n2; j++)
			R[j] = arr[mid+l+j];
		
		
		int i=0; j=0;
		int k = 1;
		
		while(i < n1 && j < n2){
			if(L[i] <= R[i]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1){
			arr[k] = L[i];
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
		MergeSort b1 = new MergeSort();
		int arr[] = {3,23,45,10,90, 22};
		
		b1.display(arr);
		b1.insertionSort(arr);
		System.out.println("Insertion Sort: " );
		b1.display(arr);
		
	}
}