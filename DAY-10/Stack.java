// array implementation
// for stack data structure we have used array data structure 
class Stack{
	static final int MAX = 10;   
	int top;
	int a[] = new int[MAX];
	
	Stack(){
		top = -1;
	}
	
	boolean isEmpty(){
		return (top < 0);     // if top is < 0 then stack is empty --> returns true or false
	}
	
	boolean isFull(){
		return (top > MAX - 1);
	}
	
	boolean push(int x){
		if(top >= (MAX - 1)){
			System.out.println("Stack Overflow!!");
			return false;          // insertion is not possible so return false
		}
		else{
			// top will be incremented and then value will be inserted
			a[++top] = x;   // top ka index increase kar raha hain or insert kar raha  hain
			System.out.println(x + " is inserted.");
			return true;				
		}
	}
	
	int pop(){
		if(top < 0){
			System.out.println("Stack Underflow!!");
			return 0;
		}
		else{
			int x = a[top--];    // first value which we want to delete in will store in x then top will be decremented
			return x;
		}
	}
	
	
	// current top value 
	int peek(){
		if(top < 0){
			System.out.println("Stack Underflow!!");
			return 0;
		} else{
			int x = a[top];
			return x;
		}
	}
	
	public static void main(String args[]){
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.pop() + " element popped.");
		System.out.println(s.peek() + " peek element.");
	}
}


/*
10 is inserted.
20 is inserted.
30 is inserted.
30 element popped.
20 peek element.
*/