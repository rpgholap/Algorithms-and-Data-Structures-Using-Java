/*
6. Find Square Root
Problem: Write a Java program to find the square root of a given number (using
integer approximation).
Test Cases:
Input: x = 16
Output: 4
Input: x = 27
Output: 5
*/

import java.util.Scanner;

class SquareRootRec {
    // Recursive binary search for integer square root
    static int sqrtRec(int x, int low, int high) {
        if (low > high) return high; // when search ends, high is floor(sqrt(x))

        int mid = (low + high) / 2;

        if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
            return mid; // found integer square root
        }

        if (mid > x / mid) {
            return sqrtRec(x, low, mid - 1); // search left half
        } else {
            return sqrtRec(x, mid + 1, high); // search right half
        }
    }

    static int sqrt(int x) {
        if (x == 0 || x == 1) return x;
        return sqrtRec(x, 1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Square Root = " + sqrt(x));
    }
}
