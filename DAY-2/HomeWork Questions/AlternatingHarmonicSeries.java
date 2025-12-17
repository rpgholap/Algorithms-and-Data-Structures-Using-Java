//The problem asks for a recursive program to compute the alternating harmonic series:
// S(N) = 1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + .......+ (-1)^N+1 1/N

import java.util.Scanner;

public class AlternatingHarmonicSeries {

    // Recursive function to calculate sum of series
    static double seriesSum(int n) {
        // Base case: if n = 1, return 1 (since the first term of the series is just 1)
        if (n == 1) {
            return 1.0;
        }

        // Recursive step:
        // The nth term is ((-1)^(n+1)) / n
        // Add it to the sum of first (n-1) terms
        return seriesSum(n - 1) + Math.pow(-1, n + 1) / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        // Calling recursive function
        double result = seriesSum(N);

        // Printing result
        System.out.println("Sum of the series up to 1/" + N + " is: " + result);

        sc.close();
    }
}


/*
Input: N = 3
Output: 0.8333333333333333
Input: N = 4
Output: 0.5833333333333333
*/