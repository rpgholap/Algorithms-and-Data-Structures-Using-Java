/*
2. Prime Number
Problem: Write a Java program to check if a given number is prime.
Test Cases:
Input: 29
Output: true
Input: 15
Output: false
*/

import java.util.Scanner;

class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	
	static boolean isPrime(int num){
		if(num <= 1){
			return false;          // Numbers <= 1 are not prime
        } 
		
		// checking for divisibility 
		for(int i = 2; i <= Math.sqrt(num) ; i++){
			if(num % i == 0){
				return false;         // divisor found -- not prime
			}
		}
		return true;
	}
	
}

/*
num = 11
11 <= 1  -->  false
Math.sqrt(11)  --> 3. ( i = 2 & i = 3)
1. i = 2  --> 11 % 2 != 0  
loop will continue 
returns true
*/