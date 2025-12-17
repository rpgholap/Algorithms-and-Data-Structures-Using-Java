// Recursion with base condition

class RecursionBaseCondition{
	
	static int i = 0;
	
	static void show(){
		++i;
		if(i <=5){
			System.out.println("Hello...!!");
			show();
		}
	}
	
	public static void main(String args[]){
		System.out.println("Recursion...!!");
		show();
	}
}


/*
Recursion...!!
Hello...!!
Hello...!!
Hello...!!
Hello...!!
Hello...!!
*/