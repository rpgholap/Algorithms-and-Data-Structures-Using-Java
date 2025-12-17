/*
10. Leap Year
Problem: Write a Java program to check if a given year is a leap year.
Test Cases:
Input: 2020
Output: true
Input: 1900
Output: false
*/

import java.util.Scanner;
class LeapYearwithRecursion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start year: ");
		int start = sc.nextInt();
		System.out.println("Enter the end year: ");
		int end = sc.nextInt();

		System.out.println("Check Leap Year: ");
		checkYears(start, end);
		
		
	}
	
	static void checkYears(int year, int end){
		if(year > end)
			return;      // base condition
	
		boolean result = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? true : false;
			
		System.out.println(result);
		
		checkYears(year + 1, end);
		
	}
	
}