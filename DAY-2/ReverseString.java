// to reverse a sentence (or string) using recursion

class ReverseString{
	static String reverse(String str){
		if(str.isEmpty()){
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0); 
	}
	
	public static void main(String args[]){
		String input1 = "CDAC Mumbai";
		String input2 = "Alice";
		
		System.out.println("Input : " + input1);
		System.out.println("Input : " + reverse(input1));
		
		System.out.println("Input : " + input2);
		System.out.println("Input : " + reverse(input2));
		
	}
}

/*
Input : CDAC Mumbai
Input : iabmuM CADC
Input : Alice
Input : ecilA
*/