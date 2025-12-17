
// recursive Java program to calculate the alternating series

class SeriesSum {
    
    // Recursive function to calculate sum
    static double sumSeries(int n) {
        if (n == 1) {
            return 1;   // base case
        }
        
        // if n is even -> subtract term
        if (n % 2 == 0) {
            return sumSeries(n - 1) - (1.0 / n);
        } 
        // if n is odd -> add term
        else {
            return sumSeries(n - 1) + (1.0 / n);
        }
    }

    public static void main(String[] args) {
        int N = 4;   // change value for testing
        double result = sumSeries(N);
        
        System.out.println("Sum of series for " + N + " is : " + result);
    }
}


//Sum of series for 4 is : 0.5833333333333333