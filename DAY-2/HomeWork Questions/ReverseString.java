// Reverse a String 

import java.util.*;

class ReverseString {
    static String reverse(String s, int i) {
        if (i < 0) 
            return "";   // base case
        return s.charAt(i) + reverse(s, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        
        String reversed = reverse(s, s.length() - 1);
        System.out.println("Reversed: " + reversed);
        
        sc.close();
    }
}


// Enter String: hello
// Reversed: olleh
