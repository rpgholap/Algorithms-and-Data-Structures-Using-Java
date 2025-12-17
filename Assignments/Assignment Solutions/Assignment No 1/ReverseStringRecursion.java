reversing a string (sentence) using recursion

import java.util.Scanner;

public class ReverseStringRecursion {

    // Recursive function to reverse a string
    static String reverse(String str) {
        // Base case: if string length is 0 or 1, return string as it is
        if (str.length() <= 1) {
            return str;
        }
        // Recursive step:
        // reverse rest of the string and then add the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a sentence/string: ");
        String input = sc.nextLine();

        // Call recursive function
        String reversed = reverse(input);

        // Print output
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
