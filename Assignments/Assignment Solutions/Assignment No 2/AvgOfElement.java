/*
4. Find the average of array elements
Testcase1:
Input: [10, 20, 30, 40, 50]
Expected Output: 30.0
Testcase2:
Input: [-5, 10, 15, -10, 5]
Expected Output: 3.0
*/

class AvgOfElement{
	
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        double sum = 0;
        for (int val : arr) 
			sum += val;
        System.out.println(sum / arr.length);
    }
}