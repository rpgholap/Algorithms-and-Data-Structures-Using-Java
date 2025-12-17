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

class PrimeNumberWithRecursion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(isPrime(num,2)){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	
	static boolean isPrime(int num, int divisor){
		if(num <= 1){
			return false;          // Numbers <= 1 are not prime
        } 
		
		// checking for divisibility 
		if(divisor > Math.sqrt(num)){
			return true;              // not found any divisor --> prime
		}
		if(num % divisor == 0){
			return false;             // divisor found --> not prime
		}


		return isPrime(num, divisor + 1); 
	}
	
}

/*
num = 11
isPrime(11, 2)
2 > sqrt(11)  -->  2 > 3.something  -->  false  --> continue
11 % 2 == 0 ---> false --> continue

recursive call (11, 3)
3 > sqrt(11)  -->  2 > 3.something  -->  false  --> continue
11 % 3 == 0 ---> false --> continue

isPrime(11, 4)
4 > sqrt(11) --> true  --> stop
*/