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
class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		boolean result = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? true : false;
			
		System.out.println(result);
	}
}