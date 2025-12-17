// LinkedList implementation

class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data = d;
		this.next = null;
	}
	
}

class StackLL{
	Node head;
	StackLL(){
		this.head = null;
	}
	
	boolean isEmpty(){
		return head == null;
	}
	
	// insertion at begining
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	// deletion at begining
	void pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow!!");
			return;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		temp = null;
	}
	
	int peek(){
		if(!isEmpty()){
			return head.data;
		}
		else{
			System.out.println("Stack Underflow!!");
			return 0;
		}
	}
}

public class StackwithLL {
    public static void main(String args[]) {
        StackLL s = new StackLL();
        s.push(10);
        s.push(20);
        s.push(30);
		
        System.out.println(s.peek() + " peek element.");
		s.pop();
        System.out.println(s.peek() + " peek element.");
    }
}


/*
30 peek element.
20 peek element.
*/