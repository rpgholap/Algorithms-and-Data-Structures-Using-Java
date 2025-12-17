/*
Q6. Sorting Strings (Lexicographic Order)
Write a program to sort an array of strings using any sorting algorithm.
Test Cases:
• Input: ["apple", "banana", "cherry", "date"] → Output: ["apple", "banana",
"cherry", "date"]
• Input: ["dog", "cat", "elephant", "bee"] → Output: ["bee", "cat", "dog",
"elephant"]
*/

import java.util.Arrays;

class StringSortSolution1 {
    public static void main(String args[]) {
        String arr[] = {"apple", "banana", "cherry", "date"};

        Arrays.sort(arr);  // built-in lexicographic sort

        System.out.println("Sorted Strings: " + Arrays.toString(arr));
    }
}
