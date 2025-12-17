
class LS {
    public static void main(String args[]) {
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int target = 110;
        int result = linearSearch(arr, target, arr.length);
        System.out.println(result);
    }
public static int linearSearch(int arr[], int key, int size) 
{
       int index = -1;
	   int i = 0;
       while(size > 0) 
       {
             if(arr[i] == key) 
             {
		  index = i;
             }
             if(arr[i] > key) 
             {
                  break;
             }
             i++;
       }
       return index;
}
}