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

class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		while(num != 0){
			int digit = num % 10;   //--> we get remainder here (last digit of a number)
			sum += digit * digit * digit;      // sum + cube of digit
			num /= 10;								// remove last digit 
		}
		
		if(original == sum)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
