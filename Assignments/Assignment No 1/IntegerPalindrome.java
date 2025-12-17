/*
9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.
Test Cases:
Input: 121
Output: true
Input: -121
Output: false
*/

import java.util.Scanner;

class IntegerPalindrome {
    static boolean isPalindrome(int x) {
        // Negative numbers are never palindromes
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
    }
}
