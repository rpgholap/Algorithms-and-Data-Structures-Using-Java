
class StackOperations{
	static final int MAX = 10;   
	int top;
	int a[] = new int[MAX];
	
	StackOperations(){
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
	
	void display() {
    if (top < 0) {
        System.out.println("Stack is empty!");
    } else {
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
	
	public static void main(String args[]){
		StackOperations s = new StackOperations();
		s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Top element (peek): " + s.peek());

        System.out.println("Popped element: " + s.pop());

        s.display();
	}
}


/*
10 is inserted.
20 is inserted.
30 is inserted.
Stack elements: 10 20 30
Top element (peek): 30
Popped element: 30
Stack elements: 10 20
*/