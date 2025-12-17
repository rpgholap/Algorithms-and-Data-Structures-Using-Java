public class LL{
		
		// head and tail are just reference variables pointing to nodes
		private Node head;
		private Node tail;    // it will help to get contant time complexity otherwise for insert element at last we require to travel all list till end then add element at last  
		
		private int size;
		
		public LL(){
			this.size = 0;
		}
		
		
		public void insertFirst(int val){
			Node node = new Node(val);
			node.next = head;
			head = node;
			
			if(tail == null){
				tail = head;
			}
			
			size += 1; 
		}
		 
		// 17 --> 8 --> 2 --> 3 --> END
		
		public void insertLast(int val){
			// if list is empty then call insertFirst()
			if(tail == null){
				insertFirst(val);
				return;    // bcz of return : it will not call anything else from this method
			}
			Node node = new Node(val);
			tail.next = node;
			tail = head;
			size++;
		}
		
		// 17 --> 8 --> 2 --> 3 --> 99 --> END
		
		
		public void insertAtIndex(int val, int index){
			if(index == 0){
				insertFirst(val);
				return;
			}
			if(index == size){
				insertLast(val);
				return;
			}
			
			Node temp = head;        // for loop starting from 1 bcz 0 is this line itself.
			for(int i = 1; i < index; i++){
				temp = temp.next;   // it will stop at index 2
				
			} 
			Node node = new Node(val, temp.next);    
			temp.next = node;
			
			size++;
		}
		// 17 --> 8 --> 2 --> 100 --> 3 --> 99 --> END
		
		
		public int deleteFirst(){
			int val = head.value;
			head = head.next;
			if(head == null){
				tail = null;
			}
			
			size--;
			return val;
		}
		
		//17      ---> value removed form first 
		// 8 --> 2 --> 100 --> 3 --> 99 --> END   
		
		
		// Delete Last Element: 
		public int deleteLast(){
			if(size < 1){
				return deleteFirst();
			}
			
			Node secondLast = get(size - 2);  // it will give second last element from list 
			int val = tail.value;
			tail = secondLast;
			tail.next = null;
			return val;
		}
		
		// 8 --> 2 --> 100 --> 3 --> END
		
		//If we want remove last element so, we can reach to second last element and make it tail which points to null 
		//i.e we have to reach to the size - 1 (second node)
		// so we have to iteratate over that time -->  for loop
		
		
		
		public Node get(int index){
			Node node = head;
			for(int i = 0; i < index; i++){
				node = node.next;
			}
			return node;
		}
		
		// returns the value of a node
		public Node findNode(int value){
			Node node = head;
			while(node != null){
				if(node.value == value){
					return node;
				}
				node = node.next;
			}
			return node;
		}
		
		
		// Delete a perticular index:
		public int deleteIndex(int index){
			if(index == 0){
				return deleteFirst();
			}
			if(index == size - 1){
				return deleteLast();
			}
			
			Node prev = get(index - 1);
			int val = prev.next.value;
			prev.next = prev.next.next;
			
			return val;
		}
		
		// 100          --> index 2 (no which will be deleted.)
		// 8 --> 2 --> 3 --> END
		
		
		public void display(){
			// we cannot move head to we added a temp pointer 
			Node temp = head;
			
			while(temp != null){
				System.out.print(temp.value + " --> ");
				temp = temp.next;
			}
			System.out.println("END");
			
		}
		
		
		
		private class Node{
			private int value;
			private Node next;
			
			// contructor:
			public Node(int value){
				this.value = value;
			}
			
			public Node(int value, Node next){
				this.value = value;
				this.next = next;
			}
		}
		
		public static void main(String args[]){
			LL list = new LL();
			list.insertFirst(3);
			list.insertFirst(2);
			list.insertFirst(8);
			list.insertFirst(17);
			
			list.insertLast(99);
			
			list.insertAtIndex(100, 3);
			list.display();
			
			System.out.println(list.deleteFirst());
			list.display();
			
			System.out.println(list.deleteLast());
			list.display();
			
			System.out.println(list.deleteIndex(2));
			list.display();
			
			
			System.out.println(list.findNode(8));
		}
}
	
