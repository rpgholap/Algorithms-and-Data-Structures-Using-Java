/*
7. Search for an element in the array (linear search).
Testcase1:
Input: [10, 20, 30, 40, 50], Search Element: 30
Expected Output: Element found at index 2
*/

class LinearSearchExample1{
	
    static int search(int[] arr, int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int index = search(arr, 30);
        if (index != -1) 
			System.out.println("Element found at index " + index);
        else 
			System.out.println("Not found");
    }
}

//Element found at index 2