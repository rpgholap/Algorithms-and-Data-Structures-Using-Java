// goes into infinite recursion

class InfiniteRecursion{
	
	static void show(){
		System.out.println("Hello Recursion");
	}
	
	public static void main(String args[]){
		System.out.println("Recursion...!!");
		show();
	}
}