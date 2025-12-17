// Print the Fibonacci series with Java and recursion

import java.util.Scanner;

class FibonacciSeriesWithRecursion{
	
	static int fibo(int n){
		if(n < 2){
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("n = ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci Series: ");
		for(int i = 0; i < n; i++){
			
			System.out.println(fibo(i) + " ");
		}
	}
	
	
}