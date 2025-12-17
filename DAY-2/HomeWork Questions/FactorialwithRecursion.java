// 3. Calculate a factorial in Java with recursion

import java.util.Scanner;
class FactorialwithRecursion{
		
	static int fact(int num){
			if(num <= 1){
				return 1;
			}
			
			return num * fact(num-1);
		}
	


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result = fact(num);
		System.out.println(result);
	}
		
}