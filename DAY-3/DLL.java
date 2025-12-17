public class DLL{
	
	
	private Node head;
	
	public void insertFirst(int val){
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null){
			head.prev = node;    
		}
		head = node;
	}
	
	public void display(){
		Node node = head;     //temp variable bcz we cannot change the head position 
		Node last = null;
		while(node != null){
			System.out.print(node.val + " -> ");
			last = node; 
			node =  node.next;
		}
		System.out.println("END");
		
		System.out.println("Print in reverse");
		while(last != null){
			System.out.print(last.val + " -> ");
			last = last.prev;
		}
		System.out.println("END");
	}
	
	
	public void insertLast(int val){
		Node node = new Node(val);
		Node last = head;
		
		node.next = null;
		
		if(head == null){
			node.prev = null;
			head = node;
			return;
		}
		while(last.next != null){
			last = last.next;
		}
		last.next = node;
		node.prev = last;
	}
	
	public Node find(int value){
		Node node = head;
		while(node != null){
			if(node.val == value){
				return node;
			}
			node  = node.next;
		}
		return null;
	}
	
	public void insert(int after, int val){
		Node p = find(after);
		
		if(p == null){
			System.out.println("Does not exists.");
			return;
		}
		Node node = new Node(val);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		
		if(node.next != null){
			node.next.prev = node;
		}
	}
	
	
	
	private class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val){
			this.val = val;
		}
		
		public Node(int val, Node next, Node prev){
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
	}
	
	
	public static void main(String args[]){
			DLL list = new DLL();
			list.insertFirst(3);
			list.insertFirst(2);
			list.insertFirst(8);
			list.insertFirst(17);
			
			list.insertLast(99);
			
			list.insert(8, 53);
			list.display();
	}
}


/*
Insert First:
17 -> 8 -> 2 -> 3 -> END
Print in reverse
3 -> 2 -> 8 -> 17 -> END


//Insert Last: 
17 -> 8 -> 2 -> 3 -> 99 -> END
Print in reverse
99 -> 3 -> 2 -> 8 -> 17 -> END

// Insert After Index:
17 -> 8 -> 53 -> 2 -> 3 -> 99 -> END
Print in reverse
99 -> 3 -> 2 -> 53 -> 8 -> 17 -> END

*/