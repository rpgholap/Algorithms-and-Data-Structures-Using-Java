/*
10. Find the second largest element in the array.
Testcase:
Input: [10, 20, 30, 40, 50]
Expected Output: 40
*/

class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int largest = Integer.MIN_VALUE;     //smallest possible integer value in Java. 
		//largest = -2147483648
        int second = Integer.MIN_VALUE;
		//second = -2147483648
		
        for (int val : arr) {
            if (val > largest) {
                second = largest;
                largest = val;
            } else if (val > second && val != largest) {
                second = val;
            }
        }

        System.out.println("Second largest: " + second);
    }
}


/*
largest = -2147483648
second  = -2147483648

val = 10
10 > largest --> yes --> second = largest -> -2147483648
						 largest = 10
val = 20 
20 > largest --> yes --> second = largest --> 10
						 largest = 20
						 
.....


Second largest: 40

*/