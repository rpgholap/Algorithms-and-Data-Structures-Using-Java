// sum(10) ; 10 + 9 + 8 + ... +1
import java.util.Scanner;

class RecursionFib{
	
	static int sum(int n){
		if(n == 0 ){
			return 0;
		}
		return n + sum(n-1); 
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("n = ");
		int num = sc.nextInt();
		
		System.out.println(sum(num));
	}
}


//https://www.mathsisfun.com/games/towerofhanoi.html