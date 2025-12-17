// 2. Sum a series of numbers with Java recursion

import java.util.Scanner;

class SumOfSeries{
	
	static int SeriesSum(int n){
		if(n == 0)
			return 0;
		
		return n + SeriesSum(n-1);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		
		int sum = SeriesSum(n);
		System.out.println("Sum of series: " + sum);
	}
}


/*
Output:
n = 5
Sum of series: 15
*/