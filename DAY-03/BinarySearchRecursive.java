class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 60;

        // Call recursive binary search
        int result = recursive(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    public static int recursive(int arr[], int low, int high, int key) {
        if (low > high) { // base case: key not found
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            return mid; // key found
        } else if (arr[mid] < key) {
            return recursive(arr, mid + 1, high, key); // search in right half
        } else {
            return recursive(arr, low, mid - 1, key); // search in left half
        }
    }
}


// Element 60 found at index: 5