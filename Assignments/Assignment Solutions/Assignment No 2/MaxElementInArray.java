/*
1. Find the maximum element in an array. Solve this problem using iterative and recursion method
Testcase1:
Input: [10, 25, 47, 3, 19]
Expected Output: 47
Testcase2:
Input: [-5, -10, -3, -20, -7]
Expected Output: -3
*/

class MaxElementInArray{
	
	//Iterative Method
    static int findMaxIterative(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) 
				max = val;
        }
        return max;
    }


	// Recursive Method
    static int findMaxRecursive(int[] arr, int n) {
        if (n == 1) 
			return arr[0];
        return Math.max(arr[n-1], findMaxRecursive(arr, n-1));
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 3, 19};
        System.out.println(findMaxIterative(arr));  
        System.out.println(findMaxRecursive(arr, arr.length));
    }
}


/*
Math.max(arr[4]=19, findMaxRecursive(arr, 4))
Math.max(arr[3]=3, findMaxRecursive(arr, 3))
Math.max(arr[2]=47, findMaxRecursive(arr, 2))
Math.max(arr[1]=25, findMaxRecursive(arr, 1))
Base case: findMaxRecursive(arr, 1) = 10

Math.max(25,10) = 25
Math.max(47,25) = 47
Math.max(3,47) = 47
Math.max(19,47) = 47

max = 47
*/