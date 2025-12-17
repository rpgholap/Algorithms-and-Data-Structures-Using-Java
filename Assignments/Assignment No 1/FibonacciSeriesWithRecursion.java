/*
4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.
Test Cases:
Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]
*/

import java.util.Scanner;

class FibonacciSeriesWithRecursion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("n = ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci Series: ");
		for(int i = 0; i < n; i++){
			
			System.out.println(fibo(i) + " ");
		}
	}
	
	static int fibo(int n){
			if(n < 2){
				return n;
			}
			return fibo(n-1) + fibo(n-2);
		}
}