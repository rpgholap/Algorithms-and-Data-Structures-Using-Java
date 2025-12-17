// 1. Print a series of numbers with recursive Java method

import java.util.Scanner;

class SeriesofNumWithRecursion {
    static void printSeries(int n) {
        if (n == 0) {
            return;  // base case
        }
        printSeries(n - 1);  // recursive call
        System.out.print(n + " "); // print after recursion (in ascending order)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        printSeries(n);
        sc.close();
    }
}
