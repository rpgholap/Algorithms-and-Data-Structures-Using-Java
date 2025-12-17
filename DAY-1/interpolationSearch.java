public class interpolationSearch {
    public static int interpolationSearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            // Handle single element case
            if (low == high) {
                if (arr[low] == key) return low;
                return -1;
            }

            // Calculate interpolated position
            int pos = low + ((key - arr[low]) * (high - low))
                    / (arr[high] - arr[low]);

            // Check if element is found
            if (arr[pos] == key)
                return pos;
            else if (arr[pos] < key)
                low = pos + 1;    // Search right half
            else
                high = pos - 1;   // Search left half
        }
        return -1; // Element not found
    }

}


