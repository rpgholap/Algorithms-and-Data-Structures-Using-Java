/*
2. Find the minimum element in an array.
Testcases1:
Input: [15, 8, 22, 5, 19]
Expected Output: 5
Testcase2:
Input: [-4, -15, -7, -2, -30]
Expected Output: -30
*/

class MinElementInArray{
	
    static int findMin(int[] arr) {
        int min = arr[0];                // assume first element is smalles
        for (int val : arr) {
            if (val < min)               // if we find something smaller --> update min
				min = val;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {15, 8, 22, 5, 19};
        System.out.println(findMin(arr));
    }
}

/*
min = arr[0] = 15
val = 15
8 < 15 --> min = 8
22 < 8 --> no change
5 < 8 --> min = 5
19 < 5 --> no change

min = 5
*/