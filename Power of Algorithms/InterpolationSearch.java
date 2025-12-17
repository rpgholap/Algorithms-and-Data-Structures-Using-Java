/*
Interpolation Search: an improved variant of Binary Search that works on a sorted array, 
but instead of checking the middle element (like binary search), 
it estimates the probable position of the key using the formula of interpolation.
It assumes that the elements are uniformly distributed.

Formula:
	pos = low + ((key - arr[low]) * (high - low)) 
                                / (arr[high] - arr[low]);
	low → start index
	high → end index
	arr[low] and arr[high] → boundary values
	key → element to search

*/

class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                if (arr[low] == key) return low;
                return -1;
            }

            // Estimate position
            int pos = low + ((key - arr[low]) * (high - low)) 
                                / (arr[high] - arr[low]);

            if (arr[pos] == key)
                return pos;
            else if (arr[pos] < key)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 71, 15, 20, 21, 50, 55, 75, 80};
        int n = arr.length;
        int key = 50;

        int index = interpolationSearch(arr, n, key);

        if (index != -1)
            System.out.println("Element " + key + " found at index " + index);
        else
            System.out.println("Element not found");
    }
}

// Output:
// Element 50 found at index 6