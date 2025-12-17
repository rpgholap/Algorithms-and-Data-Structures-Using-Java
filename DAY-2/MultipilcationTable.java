// recursive Java program to print the multiplication table of a number

class MultipilcationTable{
	static void PrintTable(int N, int i){
		if( i > 10){
			return;
		}
		
		System.out.println(N + " * " + i + " = " + (N  * i ));
		PrintTable(N, i + 1);
	}
	
	public static void main(String args[]){
		int N = 5;
		PrintTable(N, 1);
	}

}

/*
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
*/