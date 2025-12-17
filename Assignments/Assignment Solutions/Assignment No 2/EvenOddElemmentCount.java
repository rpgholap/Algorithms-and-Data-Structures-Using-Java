/*
6. Count even and odd elements in an array.
Testcase1:
Input: [1, 2, 3, 4, 5, 6]
Expected Output: Even: 3, Odd: 3
Input: [2, 4, 6, 8]
Expected Output: Even: 4, Odd: 0
*/


class EvenOddElemmentCount{
	
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int even=0, odd=0;
        for (int val : arr) {
            if (val % 2 == 0) 
				even++;
            else 
				odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}

/*
val = 1:
1%2 == 0 --> no  --> odd++ --> odd =1, even = 0
val = 2:
2%2 == 0 -- yes --> even++ --> even = 1, odd = 1
......
*/


// Output: Even: 3, Odd: 3