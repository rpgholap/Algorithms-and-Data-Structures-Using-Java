//Finding the most frequent element in an array

import java.util.Arrays;

class LSAndFreqOfElements {
    public static void main(String args[]) {

        // Call findPopular
        int[] arr2 = {10, 20, 10, 30, 20, 10};
        int popular = findPopular(arr2);
        System.out.println("Most frequent element: " + popular);
    }

    // Find most frequent element
    public static int findPopular(int[] a) {
        if (a == null || a.length == 0)
            return 0;

        Arrays.sort(a);
        int previous = a[0];
        int popular = a[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == previous) {
                count++;
            } else {
                if (count > maxCount) {
                    popular = a[i - 1];
                    maxCount = count;
                }
                previous = a[i];
                count = 1;
            }
        }
        return count > maxCount ? a[a.length - 1] : popular;
    }
}


// Index of 110: 6
Most frequent element: 10
