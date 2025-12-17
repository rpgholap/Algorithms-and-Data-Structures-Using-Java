// Sort the Array: Using Bubble Sort 


class BubbleSort {
    public int[] sortArray(int[] nums) {
        // run the steps n-1 times
        for(int i = 0; i < nums.length; i++){
            // for each step, max item will come at the last respective index
            for(int j = 0; j <nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp; 
                }
            }
        }
        return nums;
    }

   
    
}