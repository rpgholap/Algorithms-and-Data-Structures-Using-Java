/*
// Algorithm to solve the Towers of Hanoi problem using recursion

 function recursiveHanoi(n, s, a, d)
   // n = number of disks
   // s = source 
   // a = auxiliary / helper
   // d = destination 

*/



class TowerOfHanoi{
	static void toh(int n, char s, char a, char d){
		if(n==1){  // disk = 1)    // base condition (If there's only one disk)
			System.out.println("Disk from " + s + " to " + d);
		}
		else{
		toh(n-1, s, d, a);    // recursive call          --> n-1 disks transfer from source to helper (a)
		System.out.println("Disk from " + s + " to " + d);     //  --> transfer largest disk (nth disk) from the source s to the destination d.
		toh(n-1, a, s, d);    // recursive call     --> n-1 disks transfer from the helper (a) to the destination d
		}
		
	}
	
	public static void main(String args[]){
		final int n = 3;
		toh(n, 'A', 'B', 'C');
		
		// int numberofMoves = (int) Math.pow(2, n) - 1;
		// System.out.println("Number of Moves: " + numberofMoves);
	}
}

/*
Disk from A to C
Disk from A to B
Disk from C to B
Disk from A to C
Disk from B to A
Disk from B to C
Disk from A to C
Number of Moves: 7
*/