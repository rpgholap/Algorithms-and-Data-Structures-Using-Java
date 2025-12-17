// improvement in the original bubble sort : using flag which return true when swapping done
// otherwise return false.

// Time complexity: O(n);   

class BubbleSortImproved{
	
	void bubbleSort(int arr[]){
		int n = arr.length;
		boolean x;

		for(int i = 0; i < n -1; i++){     // runs passes
			x = false;                     // swap is not perform 
			for(int j = 0; j < n - i - 1; j++){  
				if(arr[j] > arr[j+1]){   
				
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
		BubbleSort b1 = new BubbleSort();
		int arr[] = {34,23,45,1,90, 22};
		
		b1.display(arr);
		b1.bubbleSort(arr);
		System.out.println("Bubble sort: " );
		b1.display(arr);
		
	}
}
