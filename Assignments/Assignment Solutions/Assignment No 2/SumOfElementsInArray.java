/*
3. Calculate the sum of all array elements. Solve this problem using iterative and recursion method
Testcase1:
Input: [1, 2, 3, 4, 5]
Expected Output: 15
Testcase2:
Input: [-1, 2, -3, 4, -5]
Expected Output: -3
*/

class SumOfElementsInArray{

    static int sumIterative(int[] arr) {
        int sum = 0;
        for (int val : arr) 
			sum += val;
        return sum;
    }

    static int sumRecursive(int[] arr, int n) {
        if (n == 0) return 0;      //stopping condition
        return arr[n-1] + sumRecursive(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumIterative(arr));
        System.out.println(sumRecursive(arr, arr.length));
    }
}


/*
sumRecursive([1,2,3,4,5], 5)
= arr[4] + sumRecursive(arr, 4)
= 5 + sumRecursive(arr, 4)

sumRecursive([1,2,3,4,5], 4)
= 4 + sumRecursive(arr, 3)

sumRecursive([1,2,3,4,5], 3)
= 3 + sumRecursive(arr, 2)

sumRecursive([1,2,3,4,5], 2)
= 2 + sumRecursive(arr, 1)

sumRecursive([1,2,3,4,5], 1)
= 1 + sumRecursive(arr, 0)

sumRecursive([1,2,3,4,5], 0)
= 0
*/