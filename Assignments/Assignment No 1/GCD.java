/*
5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two
numbers.
Test Cases:
Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1
*/


import java.util.Scanner;

class GCD {
    // Recursive function to find GCD
    static int gcd(int a, int b) {
        if (b == 0) return a;   // base case
        return gcd(b, a % b);   // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a, b));
    }
}
