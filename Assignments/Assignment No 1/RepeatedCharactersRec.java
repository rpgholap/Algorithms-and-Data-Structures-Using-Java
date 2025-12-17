/*
7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.
Test Cases:
Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']
*/


class RepeatedCharactersRec {
    // Recursive function to check repeats
    static void findRepeats(String s, int i) {
        if (i >= s.length()) return;  // base case

        char c = s.charAt(i);
        if (s.indexOf(c, i + 1) != -1) {  // if char appears again
            if (s.indexOf(c) == i) {      // print only first occurrence
                System.out.print(c + " ");
            }
        }
        findRepeats(s, i + 1);  // recursive call
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.print("Output: [");
        findRepeats(input, 0);
        System.out.println("]");
    }
}
