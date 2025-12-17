printing the multiplication table of a number using recursion.

import java.util.Scanner;

public class MultiplicationTable {

    // Recursive function to print table of N
    static void printTable(int n, int i) {
        // Base case: when i becomes greater than 10, stop
        if (i > 10) {
            return;
        }

        // Print the current multiplication
        System.out.println(n + " * " + i + " = " + (n * i));

        // Recursive call for next multiplier
        printTable(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to print its multiplication table: ");
        int N = sc.nextInt();

        // Start recursion with i = 1
        printTable(N, 1);

        sc.close();
    }
}
