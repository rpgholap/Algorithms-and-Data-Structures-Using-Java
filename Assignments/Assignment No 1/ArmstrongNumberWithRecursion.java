/*
1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong
number.
Test Cases:
Input: 153
Output: true
Input: 123
Output: false
*/

import java.util.Scanner;

class ArmstrongNumberWithRecursion{
	
	static int sumOfCube(int num){          				 // --> num 153
		if(num == 0)										 // Base case
			return 0;										 // when all digits are addressed then return zero
		int digit = num % 10;  // last digit 				 // 153 % 10  --> 3
		return digit * digit * digit + sumOfCube(num / 10);  // 3^3 + sumOfCube(153 / 10 = 15)  = 27 + sumOfCube(15)
		
		// sumOfCube(num / 10)  --> for remaining digit it will be recusively call 
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();                             // num = 153
		
		System.out.println(num == sumOfCube(num));
	}
}