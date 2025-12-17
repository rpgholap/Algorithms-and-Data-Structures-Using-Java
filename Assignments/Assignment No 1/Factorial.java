/*
3. Factorial
Problem: Write a Java program to compute the factorial of a given number.
Test Cases:
Input: 5
Output: 120
Input: 0
Output: 1
*/

import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

		System.out.println(fact(num));
	}
		static int fact(int num){
			int ans = 1;
			for(int i = 2; i <= num; i++){
				ans *= i;
			}
			return ans;
		}
	
}