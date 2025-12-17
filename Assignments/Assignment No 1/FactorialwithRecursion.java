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
class FactorialwithRecursion{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result = fact(num);
		System.out.println(result);
	}
		static int fact(int num){
			if(num == 1 || num == 0){
				return 1;
			}
			
			return num * fact(num-1);
		}
	
}